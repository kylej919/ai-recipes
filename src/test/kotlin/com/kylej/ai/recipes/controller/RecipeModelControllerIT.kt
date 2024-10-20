package com.kylej.ai.recipes.controller

import com.kylej.ai.recipes.graphql.config.SCALARS
import com.kylej.ai.recipes.graphql.generated.client.CreateRecipeGraphQLQuery
import com.kylej.ai.recipes.graphql.generated.client.CreateRecipeProjectionRoot
import com.kylej.ai.recipes.graphql.generated.client.GetRecipeGraphQLQuery
import com.kylej.ai.recipes.graphql.generated.client.GetRecipeProjectionRoot
import com.kylej.ai.recipes.graphql.generated.client.IngredientListProjection
import com.kylej.ai.recipes.graphql.generated.client.IngredientProjection
import com.kylej.ai.recipes.graphql.generated.types.Recipe
import com.kylej.ai.recipes.util.BaseProjection
import com.kylej.ai.recipes.util.GraphQLSender
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
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

    var headers: HttpHeaders = HttpHeaders()

    @BeforeEach
    fun setUp() {
        headers.add("Content-Type", "application/json")
    }

    @Test
    fun testGetRecipeSuccess() {
        val recipe: Recipe = getRecipe()
        assertThat(recipe).isNotNull()
    }

    @Test
    fun testCreateRecipeSuccess() {
        val recipe: Recipe = createRecipe()

        assertThat(recipe).isNotNull()
    }

    fun getRecipe(): Recipe {
        val projection =
            GetRecipeProjectionRoot<BaseProjection, BaseProjection>().id().instructions().name().ingredients()
                .__typename()
        val request = GraphQLQueryRequest(GetRecipeGraphQLQuery.newRequest().recipeId("1").build(), projection, SCALARS)

        return graphqlSender.query(
            queryRequest = request,
            headers = headers,
            responseClass = Recipe::class.java,
            responsePath = "data.getRecipe"
        )
    }

    fun createRecipe(): Recipe {
        val projection =
            CreateRecipeProjectionRoot<BaseProjection, BaseProjection>().id().instructions().name().ingredients()
        projection.id().ingredients().name().category()
        val request =
            GraphQLQueryRequest(
                CreateRecipeGraphQLQuery.newRequest().ingredientListId("1").build(),
                projection,
                SCALARS
            )

        return graphqlSender.mutation(
            queryRequest = request,
            headers = headers,
            responseClass = Recipe::class.java,
            responsePath = "data.createRecipe"
        )
    }
}