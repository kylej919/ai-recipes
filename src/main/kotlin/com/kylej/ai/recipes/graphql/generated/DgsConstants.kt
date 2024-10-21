package com.kylej.ai.recipes.graphql.generated

import kotlin.String

@jakarta.`annotation`.Generated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-21T02:22:04.315125Z",
)
@Generated
public object DgsConstants {
  public const val QUERY_TYPE: String = "Query"

  public const val Mutation_TYPE: String = "Mutation"

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-21T02:22:04.315125Z",
  )
  @Generated
  public object QUERY {
    public const val TYPE_NAME: String = "Query"

    public const val GetRecipe: String = "getRecipe"

    public const val GetIngredients: String = "getIngredients"

    @jakarta.`annotation`.Generated(
      value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
      date = "2024-10-21T02:22:04.315125Z",
    )
    @Generated
    public object GETRECIPE_INPUT_ARGUMENT {
      public const val RecipeId: String = "recipeId"
    }
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-21T02:22:04.315125Z",
  )
  @Generated
  public object MUTATION {
    public const val TYPE_NAME: String = "Mutation"

    public const val CreateRecipe: String = "createRecipe"

    public const val StartIngredientSelection: String = "startIngredientSelection"

    public const val AddIngredient: String = "addIngredient"

    public const val RemoveIngredient: String = "removeIngredient"

    @jakarta.`annotation`.Generated(
      value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
      date = "2024-10-21T02:22:04.315125Z",
    )
    @Generated
    public object CREATERECIPE_INPUT_ARGUMENT {
      public const val IngredientListId: String = "ingredientListId"
    }

    @jakarta.`annotation`.Generated(
      value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
      date = "2024-10-21T02:22:04.315125Z",
    )
    @Generated
    public object ADDINGREDIENT_INPUT_ARGUMENT {
      public const val IngredientListId: String = "ingredientListId"

      public const val Ingredient: String = "ingredient"
    }

    @jakarta.`annotation`.Generated(
      value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
      date = "2024-10-21T02:22:04.315125Z",
    )
    @Generated
    public object REMOVEINGREDIENT_INPUT_ARGUMENT {
      public const val IngredientListId: String = "ingredientListId"

      public const val Ingredient: String = "ingredient"
    }
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-21T02:22:04.315125Z",
  )
  @Generated
  public object RECIPE {
    public const val TYPE_NAME: String = "Recipe"

    public const val Id: String = "id"

    public const val Name: String = "name"

    public const val Ingredients: String = "ingredients"

    public const val Instructions: String = "instructions"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-21T02:22:04.315125Z",
  )
  @Generated
  public object INGREDIENTLIST {
    public const val TYPE_NAME: String = "IngredientList"

    public const val Id: String = "id"

    public const val Ingredients: String = "ingredients"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-21T02:22:04.315125Z",
  )
  @Generated
  public object INGREDIENT {
    public const val TYPE_NAME: String = "Ingredient"

    public const val Id: String = "id"

    public const val Name: String = "name"

    public const val Category: String = "category"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-21T02:22:04.315125Z",
  )
  @Generated
  public object NODE {
    public const val TYPE_NAME: String = "Node"

    public const val Id: String = "id"
  }
}
