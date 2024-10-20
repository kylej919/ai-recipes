package com.kylej.ai.recipes.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest
import org.json.JSONObject
import org.springframework.graphql.server.support.SerializableGraphQlRequest
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Service
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

private val objectMapper = ObjectMapper()

@Service
class GraphQLSender(
    private val mockMvc: MockMvc
) {

    fun <T> query(query: String, headers: HttpHeaders, responseClass: Class<T>, responsePath: String): T {
        val request = SerializableGraphQlRequest()
        request.setQuery(query)

        val action = MockMvcRequestBuilders.post("/graphql")
            .content(objectMapper.writeValueAsString(request))
            .headers(headers)

        val result = mockMvc.perform(action).andReturn()

        val paths = responsePath.split(".")
        var json = JSONObject(result.response.contentAsString)

        for (path in paths.subList(0, paths.size - 1)) {
            json = json.getJSONObject(path)
        }

        val jsonString =
            if (responseClass.isArray) json.getJSONArray(paths.last()).toString() else json.getJSONObject(paths.last())
                .toString()
        return objectMapper.readValue(jsonString, responseClass)
    }

    fun <T> mutation(
        queryRequest: GraphQLQueryRequest,
        headers: HttpHeaders,
        responseClass: Class<T>,
        responsePath: String
    ): T {
        return query(queryRequest.serialize(), headers, responseClass, responsePath)
    }

    fun <T> query(
        queryRequest: GraphQLQueryRequest,
        headers: HttpHeaders,
        responseClass: Class<T>,
        responsePath: String
    ): T {
        val operation = queryRequest.query.operation;
        val capitalized = operation[0].uppercaseChar() + operation.substring(1)
        val query = "query $capitalized ${queryRequest.serialize()}"
        return query(query, headers, responseClass, responsePath)
    }
}