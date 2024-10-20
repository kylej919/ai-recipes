package com.kylej.ai.recipes.graphql.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import com.kylej.ai.recipes.graphql.Generated as GraphqlGenerated
import jakarta.`annotation`.Generated as AnnotationGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-20T20:12:42.035642Z",
)
@GraphqlGenerated
public data class Ingredient(
  @JsonProperty("name")
  public val name: String,
  @JsonProperty("category")
  public val category: IngredientCategory,
) {
  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T20:12:42.035642Z",
  )
  @GraphqlGenerated
  public companion object
}
