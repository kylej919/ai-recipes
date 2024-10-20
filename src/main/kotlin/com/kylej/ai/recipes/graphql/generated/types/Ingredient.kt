package com.kylej.ai.recipes.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import com.kylej.ai.recipes.graphql.generated.Generated as GeneratedGenerated
import jakarta.`annotation`.Generated as AnnotationGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-20T21:27:58.226575Z",
)
@GeneratedGenerated
public data class Ingredient(
  @JsonProperty("name")
  public val name: String,
  @JsonProperty("category")
  public val category: IngredientCategory,
) {
  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T21:27:58.226575Z",
  )
  @GeneratedGenerated
  public companion object
}
