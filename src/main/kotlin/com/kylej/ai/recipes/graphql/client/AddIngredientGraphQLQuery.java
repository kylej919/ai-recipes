package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class AddIngredientGraphQLQuery extends GraphQLQuery {
  public AddIngredientGraphQLQuery(String ingredientListId, String ingredient, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ingredientListId != null || fieldsSet.contains("ingredientListId")) {
        getInput().put("ingredientListId", ingredientListId);
    }if (ingredient != null || fieldsSet.contains("ingredient")) {
        getInput().put("ingredient", ingredient);
    }
  }

  public AddIngredientGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "addIngredient";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  @Generated("com.netflix.graphql.dgs.codegen.CodeGen")
  @com.kylej.ai.recipes.graphql.Generated
  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String ingredientListId;

    private String ingredient;

    private String queryName;

    public AddIngredientGraphQLQuery build() {
      return new AddIngredientGraphQLQuery(ingredientListId, ingredient, queryName, fieldsSet);
               
    }

    public Builder ingredientListId(String ingredientListId) {
      this.ingredientListId = ingredientListId;
      this.fieldsSet.add("ingredientListId");
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
