package com.kylej.ai.recipes.controller

import com.kylej.ai.recipes.graphql.generated.types.IngredientList
import com.kylej.ai.recipes.graphql.generated.types.Recipe
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class RecipeController {

    @QueryMapping
    fun getRecipe(@Argument recipeId: String): Recipe {
        return Recipe(id = "1", name = "Pasta", ingredients = IngredientList("1", listOf()), instructions = listOf())
    }

    @MutationMapping
    fun createRecipe(@Argument ingredientListId: String): Recipe {
        return Recipe(id = "1", name = "Pasta", ingredients = IngredientList("1", listOf()), instructions = listOf())
    }

    @MutationMapping
    fun addIngredient(@Argument ingredientListId: String, @Argument ingredient: String): IngredientList {
        return IngredientList("1", listOf())
    }

    @MutationMapping
    fun removeIngredient(@Argument ingredientListId: String, @Argument ingredient: String): IngredientList {
        return IngredientList("1", listOf())
    }
}