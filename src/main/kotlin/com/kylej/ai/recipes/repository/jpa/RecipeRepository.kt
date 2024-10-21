package com.kylej.ai.recipes.repository.jpa

import com.kylej.ai.recipes.model.RecipeModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.UUID

interface RecipeRepository : JpaRepository<RecipeModel, UUID> {
    @Query("SELECT r FROM RecipeModel r WHERE r.id = :id")
    fun find(id: UUID): RecipeModel?
}