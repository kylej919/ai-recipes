package com.kylej.ai.recipes.repository

import com.kylej.ai.recipes.model.RecipeModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface RecipeRepository : JpaRepository<RecipeModel, UUID> {
}