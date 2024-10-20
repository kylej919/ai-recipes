package com.kylej.ai.recipes.service

import com.kylej.ai.recipes.graphql.generated.types.Ingredient
import com.kylej.ai.recipes.graphql.generated.types.IngredientList
import com.kylej.ai.recipes.graphql.generated.types.Recipe
import com.kylej.ai.recipes.model.RecipeModel
import com.kylej.ai.recipes.model.toIngredient
import com.kylej.ai.recipes.repository.IngredientRepository
import com.kylej.ai.recipes.repository.RecipeRepository
import org.springframework.stereotype.Service
import java.util.Optional
import java.util.UUID

@Service
class RecipeService(
    private val recipeRepository: RecipeRepository,
    private val ingredientRepository: IngredientRepository
) {

    fun getRecipe(recipeId: UUID): Recipe {
        val recipeOptional: Optional<RecipeModel> = recipeRepository.findById(recipeId);
        val recipe: RecipeModel =
            recipeOptional.orElseThrow { IllegalArgumentException("Recipe with id ${recipeId} not found") }
        return Recipe(
            id = recipe.id.toString(),
            name = recipe.name,
            ingredients = IngredientList(
                id = recipe.id.toString(),
                ingredients = recipe.ingredients.map { toIngredient(it) }
            ),
            instructions = recipe.instructions
        )
    }

    fun getIngredients(): List<Ingredient> {
        val ingredients = ingredientRepository.findAll()
        return ingredients.stream().map { toIngredient(it) }.toList()
    }
}