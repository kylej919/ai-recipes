package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class RemoveIngredientFromRecipeGraphQLQuery extends GraphQLQuery {
  public RemoveIngredientFromRecipeGraphQLQuery(String recipeId, String ingredient,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (recipeId != null || fieldsSet.contains("recipeId")) {
        getInput().put("recipeId", recipeId);
    }if (ingredient != null || fieldsSet.contains("ingredient")) {
        getInput().put("ingredient", ingredient);
    }
  }

  public RemoveIngredientFromRecipeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "removeIngredientFromRecipe";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  @Generated("com.netflix.graphql.dgs.codegen.CodeGen")
  @com.kylej.ai.recipes.graphql.Generated
  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String recipeId;

    private String ingredient;

    private String queryName;

    public RemoveIngredientFromRecipeGraphQLQuery build() {
      return new RemoveIngredientFromRecipeGraphQLQuery(recipeId, ingredient, queryName, fieldsSet);
               
    }

    public Builder recipeId(String recipeId) {
      this.recipeId = recipeId;
      this.fieldsSet.add("recipeId");
      return this;
    }

    public Builder ingredient(String ingredient) {
      this.ingredient = ingredient;
      this.fieldsSet.add("ingredient");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
