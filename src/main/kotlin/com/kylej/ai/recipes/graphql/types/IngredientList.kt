package com.kylej.ai.recipes.graphql.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String
import kotlin.collections.List
import com.kylej.ai.recipes.graphql.Generated as GraphqlGenerated
import jakarta.`annotation`.Generated as AnnotationGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-20T20:12:42.035642Z",
)
@GraphqlGenerated
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class IngredientList(
  @JsonProperty("id")
  override val id: String,
  @JsonProperty("ingredients")
  public val ingredients: List<Ingredient>,
) : Node {
  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T20:12:42.035642Z",
  )
  @GraphqlGenerated
  public companion object
}
