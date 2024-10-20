package com.kylej.ai.recipes.model

import com.kylej.ai.recipes.util.StringListConverter
import jakarta.persistence.*
import java.util.UUID

/**
 * @see https://jpa-buddy.com/blog/best-practices-and-common-pitfalls/
 */
@Entity
@Table(name = "recipes")
open class RecipeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: UUID = UUID.randomUUID()

    val name: String = "NA"

    @OneToMany
    var ingredients: MutableList<IngredientModel> = mutableListOf()

    @Convert(converter = StringListConverter::class)
    var instructions: MutableList<String> = mutableListOf()
}