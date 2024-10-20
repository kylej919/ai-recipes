package com.kylej.ai.recipes.graphql.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import com.kylej.ai.recipes.graphql.Generated as GraphqlGenerated
import jakarta.`annotation`.Generated as AnnotationGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-20T18:06:04.033946Z",
)
@GraphqlGenerated
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename",
)
@JsonSubTypes(value = [
  JsonSubTypes.Type(value = FatWrapper::class, name = "FatWrapper"),
  JsonSubTypes.Type(value = DairyWrapper::class, name = "DairyWrapper"),
  JsonSubTypes.Type(value = ProteinWrapper::class, name = "ProteinWrapper"),
  JsonSubTypes.Type(value = GrainWrapper::class, name = "GrainWrapper"),
  JsonSubTypes.Type(value = VegetableWrapper::class, name = "VegetableWrapper"),
  JsonSubTypes.Type(value = FruitWrapper::class, name = "FruitWrapper"),
  JsonSubTypes.Type(value = HerbSpiceWrapper::class, name = "HerbSpiceWrapper"),
  JsonSubTypes.Type(value = SauceCondimentWrapper::class, name = "SauceCondimentWrapper"),
  JsonSubTypes.Type(value = SweetenerWrapper::class, name = "SweetenerWrapper"),
  JsonSubTypes.Type(value = BakingIngredientWrapper::class, name = "BakingIngredientWrapper"),
  JsonSubTypes.Type(value = NutsAndSeedsWrapper::class, name = "NutsAndSeedsWrapper")
])
public interface Ingredient {
  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @GraphqlGenerated
  public companion object
}
