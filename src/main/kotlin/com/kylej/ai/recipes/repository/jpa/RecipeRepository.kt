package com.kylej.ai.recipes.repository.jpa

import com.kylej.ai.recipes.model.RecipeModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface RecipeRepository : JpaRepository<RecipeModel, UUID> {
    fun find(id: UUID): RecipeModel?
}