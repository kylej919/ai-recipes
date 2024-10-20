package com.kylej.ai.recipes.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.generated.Generated
public class RemoveIngredientGraphQLQuery extends GraphQLQuery {
  public RemoveIngredientGraphQLQuery(String ingredientListId, String ingredient, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ingredientListId != null || fieldsSet.contains("ingredientListId")) {
        getInput().put("ingredientListId", ingredientListId);
    }if (ingredient != null || fieldsSet.contains("ingredient")) {
        getInput().put("ingredient", ingredient);
    }
  }

  public RemoveIngredientGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "removeIngredient";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  @Generated("com.netflix.graphql.dgs.codegen.CodeGen")
  @com.kylej.ai.recipes.graphql.generated.Generated
  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String ingredientListId;

    private String ingredient;

    private String queryName;

    public RemoveIngredientGraphQLQuery build() {
      return new RemoveIngredientGraphQLQuery(ingredientListId, ingredient, queryName, fieldsSet);
               
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
