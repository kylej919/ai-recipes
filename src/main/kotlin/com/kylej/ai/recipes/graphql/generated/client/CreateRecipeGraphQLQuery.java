package com.kylej.ai.recipes.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.generated.Generated
public class CreateRecipeGraphQLQuery extends GraphQLQuery {
  public CreateRecipeGraphQLQuery(String ingredientListId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ingredientListId != null || fieldsSet.contains("ingredientListId")) {
        getInput().put("ingredientListId", ingredientListId);
    }
  }

  public CreateRecipeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "createRecipe";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  @Generated("com.netflix.graphql.dgs.codegen.CodeGen")
  @com.kylej.ai.recipes.graphql.generated.Generated
  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String ingredientListId;

    private String queryName;

    public CreateRecipeGraphQLQuery build() {
      return new CreateRecipeGraphQLQuery(ingredientListId, queryName, fieldsSet);
               
    }

    public Builder ingredientListId(String ingredientListId) {
      this.ingredientListId = ingredientListId;
      this.fieldsSet.add("ingredientListId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
