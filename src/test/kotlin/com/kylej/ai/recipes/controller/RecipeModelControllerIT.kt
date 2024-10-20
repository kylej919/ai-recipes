package com.kylej.ai.recipes.controller

import com.kylej.ai.recipes.graphql.config.SCALARS
import com.kylej.ai.recipes.graphql.generated.client.*
import com.kylej.ai.recipes.graphql.generated.types.Ingredient
import com.kylej.ai.recipes.graphql.generated.types.IngredientCategory
import com.kylej.ai.recipes.graphql.generated.types.IngredientList
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
import org.springframework.test.context.jdbc.Sql

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = ["classpath:sql/ingredient-list.sql"])
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

    @Test
    fun testGetIngredientsSuccess() {
        val ingredients: List<Ingredient> = getIngredients()
        assertThat(ingredients).isNotNull()
        assertThat(ingredients).hasSizeGreaterThan(100)
        assertThat(ingredients).contains(Ingredient("Olive Oil", IngredientCategory.FAT))
    }

    @Test
    fun testAddIngredientSuccess() {
        val ingredients: IngredientList = addIngredient()
        assertThat(ingredients).isNotNull()
    }

    @Test
    fun testRemoveIngredientSuccess() {
        val ingredients: IngredientList = removeIngredient()
        assertThat(ingredients).isNotNull()
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

    fun getIngredients(): List<Ingredient> {
        val projection = GetIngredientsProjectionRoot<BaseProjection, BaseProjection>().name().category()
        val request = GraphQLQueryRequest(GetIngredientsGraphQLQuery.newRequest().build(), projection, SCALARS)

        return graphqlSender.query(
            queryRequest = request,
            headers = headers,
            responseClass = Array<Ingredient>::class.java,
            responsePath = "data.getIngredients"
        ).toList()
    }

    fun addIngredient(): IngredientList {
        val projection =
            AddIngredientProjectionRoot<BaseProjection, BaseProjection>().id().ingredients().name().category()
        val request = GraphQLQueryRequest(
            AddIngredientGraphQLQuery.newRequest().ingredientListId("1").ingredient("Olive Oil").build(),
            projection,
            SCALARS
        )

        return graphqlSender.mutation(
            queryRequest = request,
            headers = headers,
            responseClass = IngredientList::class.java,
            responsePath = "data.addIngredient"
        )
    }

    fun removeIngredient(): IngredientList {
        val projection =
            RemoveIngredientProjectionRoot<BaseProjection, BaseProjection>().id().ingredients().name().category()
        val request = GraphQLQueryRequest(
            RemoveIngredientGraphQLQuery.newRequest().ingredientListId("1").ingredient("Olive Oil").build(),
            projection,
            SCALARS
        )

        return graphqlSender.mutation(
            queryRequest = request,
            headers = headers,
            responseClass = IngredientList::class.java,
            responsePath = "data.removeIngredient"
        )
    }
}