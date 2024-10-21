package com.kylej.ai.recipes.service

import com.kylej.ai.recipes.graphql.generated.types.Ingredient
import com.kylej.ai.recipes.graphql.generated.types.IngredientList
import com.kylej.ai.recipes.graphql.generated.types.Recipe
import com.kylej.ai.recipes.model.*
import com.kylej.ai.recipes.repository.manager.RecipeRepositoryManager
import org.springframework.stereotype.Service
import java.util.*

@Service
class RecipeService(
    private val recipeRepositoryManager: RecipeRepositoryManager,
    private val openAIService: OpenAIService
) {

    fun getRecipe(recipeId: UUID): Recipe {
        val recipe: RecipeModel = recipeRepositoryManager.getRecipeById(recipeId)
        return toRecipe(recipe)
    }

    /**
     * Get all ingredients currently in the system.
     */
    fun getIngredients(): List<Ingredient> {
        val ingredients = recipeRepositoryManager.findAllIngredients()
        return ingredients.stream().map { toIngredient(it) }.toList()
    }

    /**
     * Start the ingredient selection process by creating a new ingredient list.
     */
    fun startIngredientSelection(): IngredientList {
        return toIngredientsList(recipeRepositoryManager.saveIngredientList(IngredientListModel()))
    }

    /**
     * Add an ingredient with the provided name to the ingredient list with the provided id.
     */
    fun addIngredient(ingredientListId: UUID, ingredientName: String): IngredientList {
        val ingredientList = recipeRepositoryManager.getIngredientListById(ingredientListId)
        val ingredient: IngredientModel = recipeRepositoryManager.getIngredientByName(ingredientName)

        ingredientList.ingredients.add(ingredient)
        return toIngredientsList(recipeRepositoryManager.saveIngredientList(ingredientList))
    }

    /**
     * Remove an ingredient with the provided name from the ingredient list with the provided id.
     */
    fun removeIngredient(listId: UUID, ingredient: String): IngredientList {
        val ingredientList = recipeRepositoryManager.getIngredientListById(listId)
        val ingredientModel = recipeRepositoryManager.getIngredientByName(ingredient)

        val result = ingredientList.ingredients.remove(ingredientModel)
        require(result) { "Ingredient with name $ingredient not found in list with id $listId" }

        return toIngredientsList(recipeRepositoryManager.saveIngredientList(ingredientList))
    }

    fun createRecipe(ingredientListId: UUID): Recipe {
        val ingredientList = recipeRepositoryManager.getIngredientListById(ingredientListId)
        val recipeResponse = openAIService.createRecipeInstructions(ingredientList)

        val recipe = RecipeModel()
        recipe.name = recipeResponse.name
        recipe.ingredientList = ingredientList
        recipe.instructions = recipeResponse.instructions.toMutableList()

        return toRecipe(recipeRepositoryManager.saveRecipe(recipe))
    }
}