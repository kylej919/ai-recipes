package com.kylej.ai.recipes.service.entity

data class RecipeResponse(
    val id: String,
    val instructions: List<String>,
    val article: String
)