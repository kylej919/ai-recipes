package com.kylej.ai.recipes.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String
import kotlin.collections.List
import com.kylej.ai.recipes.graphql.generated.Generated as GeneratedGenerated
import jakarta.`annotation`.Generated as AnnotationGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-21T02:22:04.315125Z",
)
@GeneratedGenerated
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class IngredientList(
  @JsonProperty("id")
  override val id: String,
  @JsonProperty("ingredients")
  public val ingredients: List<Ingredient>,
) : Node {
  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-21T02:22:04.315125Z",
  )
  @GeneratedGenerated
  public companion object
}
