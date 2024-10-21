package com.kylej.ai.recipes.model

import com.kylej.ai.recipes.graphql.generated.types.Recipe
import com.kylej.ai.recipes.util.StringListConverter
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import java.time.Instant
import java.util.UUID

fun toRecipe(recipe: RecipeModel): Recipe {
    return Recipe(
        id = "recipe_${recipe.id}",
        name = recipe.name,
        ingredients = toIngredientsList(recipe.ingredientList),
        instructions = recipe.instructions,
        article = recipe.article
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

    @Column(columnDefinition = "TEXT", nullable = false)
    var name: String = "NA"

    @OneToOne
    var ingredientList: IngredientListModel = IngredientListModel()

    @Convert(converter = StringListConverter::class)
    @Column(columnDefinition = "TEXT", nullable = false)
    var instructions: MutableList<String> = mutableListOf()

    @Column(columnDefinition = "TEXT", nullable = false)
    var article: String = ""

    @CreationTimestamp
    var createdAt: Timestamp = Timestamp.from(Instant.now())

    @UpdateTimestamp
    var modifiedAt: Timestamp = Timestamp.from(Instant.now())
}