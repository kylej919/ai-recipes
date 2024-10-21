package com.kylej.ai.recipes.repository.manager

import com.kylej.ai.recipes.model.IngredientListModel
import com.kylej.ai.recipes.model.IngredientModel
import com.kylej.ai.recipes.model.RecipeModel
import com.kylej.ai.recipes.repository.jpa.IngredientListRepository
import com.kylej.ai.recipes.repository.jpa.IngredientRepository
import com.kylej.ai.recipes.repository.jpa.RecipeRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class RecipeRepositoryManager(
    private val recipeRepository: RecipeRepository,
    private val ingredientRepository: IngredientRepository,
    private val ingredientListRepository: IngredientListRepository
) {

    fun findAllIngredients(): List<IngredientModel> = ingredientRepository.findAll()

    fun getIngredientByName(name: String): IngredientModel =
        requireNotNull(ingredientRepository.findByName(name)) { "Ingredient with name $name not found" }

    fun getRecipeById(id: UUID): RecipeModel =
        requireNotNull(recipeRepository.find(id)) { "Recipe with id $id not found" }

    fun saveIngredientList(ingredientList: IngredientListModel): IngredientListModel =
        ingredientListRepository.save(ingredientList)

    fun getIngredientListById(id: UUID): IngredientListModel =
        requireNotNull(ingredientListRepository.findById(id)) { "Ingredient list with id $id not found" }

    fun saveRecipe(recipe: RecipeModel): RecipeModel = recipeRepository.save(recipe)
}