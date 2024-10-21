package com.kylej.ai.recipes.model

import com.kylej.ai.recipes.graphql.generated.types.Ingredient
import com.kylej.ai.recipes.graphql.generated.types.IngredientCategory
import jakarta.persistence.*
import java.util.UUID

fun toIngredient(ingredient: IngredientModel): Ingredient {
    return Ingredient(
        id = "ingredient_${ingredient.id}",
        name = ingredient.name,
        category = ingredient.category
    )
}

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
    val category: IngredientCategory = IngredientCategory.NA
}