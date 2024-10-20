package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class GetRecipeGraphQLQuery extends GraphQLQuery {
  public GetRecipeGraphQLQuery(String recipeId, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (recipeId != null || fieldsSet.contains("recipeId")) {
        getInput().put("recipeId", recipeId);
    }
  }

  public GetRecipeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "getRecipe";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  @Generated("com.netflix.graphql.dgs.codegen.CodeGen")
  @com.kylej.ai.recipes.graphql.Generated
  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String recipeId;

    private String queryName;

    public GetRecipeGraphQLQuery build() {
      return new GetRecipeGraphQLQuery(recipeId, queryName, fieldsSet);
               
    }

    public Builder recipeId(String recipeId) {
      this.recipeId = recipeId;
      this.fieldsSet.add("recipeId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
