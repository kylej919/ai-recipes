package com.kylej.ai.recipes.repository.jpa

import com.kylej.ai.recipes.model.IngredientListModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface IngredientListRepository : JpaRepository<IngredientListModel, String> {
    fun findById(id: UUID): IngredientListModel?
}