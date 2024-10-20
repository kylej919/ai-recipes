package com.kylej.ai.recipes.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String
import com.kylej.ai.recipes.graphql.generated.Generated as GeneratedGenerated
import jakarta.`annotation`.Generated as AnnotationGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-20T21:27:58.226575Z",
)
@GeneratedGenerated
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename",
)
@JsonSubTypes(value = [
  JsonSubTypes.Type(value = Recipe::class, name = "Recipe"),
  JsonSubTypes.Type(value = IngredientList::class, name = "IngredientList")
])
public interface Node {
  public val id: String

  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T21:27:58.226575Z",
  )
  @GeneratedGenerated
  public companion object
}
