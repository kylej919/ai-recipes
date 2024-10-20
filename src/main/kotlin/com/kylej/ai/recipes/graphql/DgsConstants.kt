package com.kylej.ai.recipes.graphql

import kotlin.String

@jakarta.`annotation`.Generated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-20T18:06:04.033946Z",
)
@Generated
public object DgsConstants {
  public const val QUERY_TYPE: String = "Query"

  public const val Mutation_TYPE: String = "Mutation"

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object QUERY {
    public const val TYPE_NAME: String = "Query"

    public const val GetRecipe: String = "getRecipe"

    @jakarta.`annotation`.Generated(
      value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
      date = "2024-10-20T18:06:04.033946Z",
    )
    @Generated
    public object GETRECIPE_INPUT_ARGUMENT {
      public const val Id: String = "id"
    }
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object MUTATION {
    public const val TYPE_NAME: String = "Mutation"

    public const val CreateRecipe: String = "createRecipe"

    public const val AddIngredientToRecipe: String = "addIngredientToRecipe"

    public const val RemoveIngredientFromRecipe: String = "removeIngredientFromRecipe"

    @jakarta.`annotation`.Generated(
      value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
      date = "2024-10-20T18:06:04.033946Z",
    )
    @Generated
    public object ADDINGREDIENTTORECIPE_INPUT_ARGUMENT {
      public const val RecipeId: String = "recipeId"

      public const val Ingredient: String = "ingredient"
    }

    @jakarta.`annotation`.Generated(
      value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
      date = "2024-10-20T18:06:04.033946Z",
    )
    @Generated
    public object REMOVEINGREDIENTFROMRECIPE_INPUT_ARGUMENT {
      public const val RecipeId: String = "recipeId"

      public const val Ingredient: String = "ingredient"
    }
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
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
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object FATWRAPPER {
    public const val TYPE_NAME: String = "FatWrapper"

    public const val Fat: String = "fat"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object DAIRYWRAPPER {
    public const val TYPE_NAME: String = "DairyWrapper"

    public const val Dairy: String = "dairy"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object SWEETENERWRAPPER {
    public const val TYPE_NAME: String = "SweetenerWrapper"

    public const val Sweetener: String = "sweetener"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object PROTEINWRAPPER {
    public const val TYPE_NAME: String = "ProteinWrapper"

    public const val Protein: String = "protein"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object GRAINWRAPPER {
    public const val TYPE_NAME: String = "GrainWrapper"

    public const val Grain: String = "grain"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object VEGETABLEWRAPPER {
    public const val TYPE_NAME: String = "VegetableWrapper"

    public const val Vegetable: String = "vegetable"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object FRUITWRAPPER {
    public const val TYPE_NAME: String = "FruitWrapper"

    public const val Fruit: String = "fruit"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object HERBSPICEWRAPPER {
    public const val TYPE_NAME: String = "HerbSpiceWrapper"

    public const val Spice: String = "spice"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object SAUCECONDIMENTWRAPPER {
    public const val TYPE_NAME: String = "SauceCondimentWrapper"

    public const val Sauce: String = "sauce"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object BAKINGINGREDIENTWRAPPER {
    public const val TYPE_NAME: String = "BakingIngredientWrapper"

    public const val BakingIngredient: String = "bakingIngredient"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object NUTSANDSEEDSWRAPPER {
    public const val TYPE_NAME: String = "NutsAndSeedsWrapper"

    public const val NutsAndSeeds: String = "nutsAndSeeds"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object NODE {
    public const val TYPE_NAME: String = "Node"

    public const val Id: String = "id"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @Generated
  public object INGREDIENT {
    public const val TYPE_NAME: String = "Ingredient"
  }
}
