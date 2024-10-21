package com.kylej.ai.recipes.service.entity

data class RecipeResponse(
    val name: String,
    val instructions: List<String>,
    val article: String
)