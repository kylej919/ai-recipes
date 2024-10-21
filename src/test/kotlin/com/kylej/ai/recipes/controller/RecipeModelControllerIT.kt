package com.kylej.ai.recipes.controller

import com.kylej.ai.recipes.graphql.config.SCALARS
import com.kylej.ai.recipes.graphql.generated.client.*
import com.kylej.ai.recipes.graphql.generated.types.Ingredient
import com.kylej.ai.recipes.graphql.generated.types.IngredientList
import com.kylej.ai.recipes.graphql.generated.types.Recipe
import com.kylej.ai.recipes.model.toIngredient
import com.kylej.ai.recipes.repository.manager.RecipeRepositoryManager
import com.kylej.ai.recipes.util.BaseProjection
import com.kylej.ai.recipes.util.GraphQLSender
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpHeaders
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.jdbc.Sql
import java.util.*

@ActiveProfiles(profiles = ["test","personal"])
@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = ["classpath:sql/ingredient-list.sql"])
class RecipeModelControllerIT {

    @Autowired
    private lateinit var graphqlSender: GraphQLSender

    @Autowired
    private lateinit var recipeRepositoryManager: RecipeRepositoryManager

    @Value("\${spring.ai.openai.api-key}")
    val token: String = ""

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

//    @Test
//    fun testCreateRecipeSuccess() {
//        val recipe: Recipe = createRecipe()
//        assertThat(recipe).isNotNull()
//    }

    @Test
    fun testGetIngredientsSuccess() {
        val ingredients: List<Ingredient> = getIngredients()
        assertThat(ingredients).isNotNull()
        assertThat(ingredients).hasSizeGreaterThan(100)
    }

//    @Test
//    fun testAddIngredientSuccess() {
//        val ingredients: IngredientList = addIngredient()
//        assertThat(ingredients).isNotNull()
//    }

//    @Test
//    fun testRemoveIngredientSuccess() {
//        val ingredients: IngredientList = removeIngredient()
//        assertThat(ingredients).isNotNull()
//    }

    @Test
    fun testUserFlowSuccess() {
        var ingredients: IngredientList = startIngredientSelection()
        assertThat(ingredients).isNotNull()
        assertThat(ingredients.ingredients).isEmpty()

        val oliveOil = recipeRepositoryManager.getIngredientByName("Olive Oil")
        val steak = recipeRepositoryManager.getIngredientByName("Steak")
        val garlic = recipeRepositoryManager.getIngredientByName("Garlic")

        ingredients = addIngredient(ingredients.id, toIngredient(oliveOil))
        assertThat(ingredients.ingredients).hasSize(1)
        assertThat(ingredients.ingredients[0].name).isEqualTo("Olive Oil")

        ingredients = addIngredient(ingredients.id, toIngredient(steak))
        assertThat(ingredients.ingredients).hasSize(2)
        assertThat(ingredients.ingredients[1].name).isEqualTo("Steak")

        ingredients = addIngredient(ingredients.id, toIngredient(garlic))
        assertThat(ingredients.ingredients).hasSize(3)
        assertThat(ingredients.ingredients[2].name).isEqualTo("Garlic")

        ingredients = removeIngredient(ingredients.id, toIngredient(oliveOil))
        assertThat(ingredients.ingredients).hasSize(2)
        assertThat(ingredients.ingredients[0].name).isEqualTo("Steak")
        assertThat(ingredients.ingredients[1].name).isEqualTo("Garlic")

        var recipe: Recipe = createRecipe(ingredients.id)
        assertThat(recipe).isNotNull()
        assertThat(recipe.ingredients.ingredients).isEqualTo(ingredients).hasSizeGreaterThan(1)
        assertThat(recipe.name).isNotBlank().isNotNull()

        recipe = getRecipe()
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

    fun createRecipe(ingredientListId: String): Recipe {
        val projection =
            CreateRecipeProjectionRoot<BaseProjection, BaseProjection>().id().instructions().name().ingredients()
        projection.id().ingredients().name().category()
        val request =
            GraphQLQueryRequest(
                CreateRecipeGraphQLQuery.newRequest().ingredientListId(ingredientListId).build(),
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

    fun addIngredient(ingredientListId: String, ingredient: Ingredient): IngredientList {
        val projection =
            AddIngredientProjectionRoot<BaseProjection, BaseProjection>().id().ingredients().id().name().category()
        val request = GraphQLQueryRequest(
            AddIngredientGraphQLQuery.newRequest().ingredientListId(ingredientListId).ingredient(ingredient.name).build(),
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

    fun removeIngredient(ingredientListId: String, ingredient: Ingredient): IngredientList {
        val projection =
            RemoveIngredientProjectionRoot<BaseProjection, BaseProjection>().id().ingredients().id().name().category()
        val request = GraphQLQueryRequest(
            RemoveIngredientGraphQLQuery.newRequest().ingredientListId(ingredientListId).ingredient(ingredient.name).build(),
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

    fun startIngredientSelection(): IngredientList {
        val projection =
            StartIngredientSelectionProjectionRoot<BaseProjection, BaseProjection>().id().ingredients().name()
                .category()
        val request = GraphQLQueryRequest(
            StartIngredientSelectionGraphQLQuery.newRequest().build(),
            projection,
            SCALARS
        )

        return graphqlSender.mutation(
            queryRequest = request,
            headers = headers,
            responseClass = IngredientList::class.java,
            responsePath = "data.startIngredientSelection"
        )
    }
}