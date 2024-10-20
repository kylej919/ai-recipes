package com.kylej.ai.recipes.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "ingredient")
open class IngredientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID = UUID.randomUUID()

    @Column(nullable = false, unique = true)
    val name: String = "default"

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val category: FoodCategory = FoodCategory.NA
}