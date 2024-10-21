package com.kylej.ai.recipes.util

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.graphql.server.support.SerializableGraphQlRequest

/**
 * This is a workaround to a deserialize issue with the SerializableGraphQlRequest class. There is a field named
 * 'document' which we need to exclude from deserialization
 */
class GraphQLRequest : SerializableGraphQlRequest() {

    @JsonIgnore
    override fun getDocument(): String {
        return super.getDocument()
    }
}