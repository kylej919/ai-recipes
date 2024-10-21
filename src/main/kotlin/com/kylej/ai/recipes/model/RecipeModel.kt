package com.kylej.ai.recipes.model

import com.kylej.ai.recipes.graphql.generated.types.Recipe
import com.kylej.ai.recipes.util.StringListConverter
import jakarta.persistence.*
import java.util.UUID

fun toRecipe(recipe: RecipeModel): Recipe {
    return Recipe(
        id = "recipe_${recipe.id}",
        name = recipe.name,
        ingredients = toIngredientsList(recipe.ingredientList),
        instructions = recipe.instructions
    )
}

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

    @OneToOne
    var ingredientList: IngredientListModel = IngredientListModel()

    @Convert(converter = StringListConverter::class)
    var instructions: MutableList<String> = mutableListOf()
}