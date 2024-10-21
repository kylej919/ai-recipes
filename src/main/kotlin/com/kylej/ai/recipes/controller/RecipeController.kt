package com.kylej.ai.recipes.controller

import com.kylej.ai.recipes.graphql.generated.types.Ingredient
import com.kylej.ai.recipes.graphql.generated.types.IngredientList
import com.kylej.ai.recipes.graphql.generated.types.Recipe
import com.kylej.ai.recipes.service.RecipeService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.UUID

/**
 * Controller for handling recipe-related GraphQL queries and mutations.
 */
@Controller
class RecipeController(
    private val recipeService: RecipeService
) {

    /**
     * Retrieve a recipe by its id.
     */
    @QueryMapping
    fun getRecipe(@Argument recipeId: String): Recipe {
        return recipeService.getRecipe(getId(recipeId))
    }

    /**
     * Retrieve all ingredients currently in the system.
     */
    @QueryMapping
    fun getIngredients(): List<Ingredient> {
        return recipeService.getIngredients()
    }

    /**
     * Start the ingredient selection process by creating a new ingredient list.
     */
    @MutationMapping
    fun startIngredientSelection(): IngredientList {
        return recipeService.startIngredientSelection()
    }

    /**
     * Create a new recipe with the provided ingredient list id.
     */
    @MutationMapping
    fun createRecipe(@Argument ingredientListId: String): Recipe {
        return recipeService.createRecipe(getId(ingredientListId))
    }

    /**
     * Add an ingredient with the provided name to the ingredient list with the provided id.
     */
    @MutationMapping
    fun addIngredient(@Argument ingredientListId: String, @Argument ingredient: String): IngredientList {
        val listId = getId(ingredientListId)
        return recipeService.addIngredient(listId, ingredient)
    }

    /**
     * Remove an ingredient with the provided name from the ingredient list with the provided id.
     */
    @MutationMapping
    fun removeIngredient(@Argument ingredientListId: String, @Argument ingredient: String): IngredientList {
        val listId = getId(ingredientListId)
        return recipeService.removeIngredient(listId, ingredient)
    }

    /**
     * Get the UUID from the provided node id.
     */
    private fun getId(nodeId: String): UUID {
        val idSegments: List<String> = nodeId.split("_")
        return UUID.fromString(idSegments[idSegments.lastIndex])
    }
}