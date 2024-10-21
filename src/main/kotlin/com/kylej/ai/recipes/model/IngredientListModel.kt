package com.kylej.ai.recipes.model

import com.kylej.ai.recipes.graphql.generated.types.IngredientList
import jakarta.persistence.*
import java.util.*

fun toIngredientsList(ingredientsList: IngredientListModel): IngredientList {
    return IngredientList(
        id = "ingredient_list_${ingredientsList.id}",
        ingredients = ingredientsList.ingredients.map { toIngredient(it) }
    )
}

@Entity
@Table(name = "ingredient_list")
open class IngredientListModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: UUID = UUID.randomUUID()

    @OneToMany
    var ingredients: MutableList<IngredientModel> = mutableListOf()
}