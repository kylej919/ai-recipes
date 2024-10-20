package com.kylej.ai.recipes.controller

import com.kylej.ai.recipes.graphql.types.Recipe
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class RecipeController {

    @QueryMapping
    fun getRecipe(@Argument id: String): Recipe {
        return Recipe(id = "1", name = "Pasta", ingredients = listOf(), instructions = listOf())
    }
}