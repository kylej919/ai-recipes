package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class CreateRecipeGraphQLQuery extends GraphQLQuery {
  public CreateRecipeGraphQLQuery(String queryName) {
    super("mutation", queryName);
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
  @com.kylej.ai.recipes.graphql.Generated
  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public CreateRecipeGraphQLQuery build() {
      return new CreateRecipeGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
