package com.kylej.ai.recipes.controller

import com.kylej.ai.recipes.graphql.client.GetRecipeGraphQLQuery
import com.kylej.ai.recipes.graphql.client.GetRecipeProjectionRoot
import com.kylej.ai.recipes.graphql.types.Recipe
import com.kylej.ai.recipes.util.BaseProjection
import com.kylej.ai.recipes.util.GraphQLSender
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpHeaders

@SpringBootTest
@AutoConfigureMockMvc
class RecipeModelControllerIT {

    @Autowired
    private lateinit var graphqlSender: GraphQLSender

    @Test
    fun testGetRecipe() {
        val projection =
            GetRecipeProjectionRoot<BaseProjection, BaseProjection>().id().instructions().name().ingredients()
                .__typename()
        val request = GraphQLQueryRequest(GetRecipeGraphQLQuery.newRequest().recipeId("1").build(), projection)


        val headers = HttpHeaders()
        headers.add("Content-Type", "application/json")
        val recipe: Recipe = graphqlSender.query(
            queryRequest = request,
            headers = headers,
            responseClass = Recipe::class.java,
            responsePath = "data.getRecipe"
        )
        assertThat(recipe).isNotNull()
    }

}