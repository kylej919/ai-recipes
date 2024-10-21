package com.kylej.ai.recipes.repository.jpa

import com.kylej.ai.recipes.model.IngredientModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface IngredientRepository : JpaRepository<IngredientModel, UUID> {

    fun findByName(name: String): IngredientModel?
}