package com.kylej.ai.recipes.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.generated.Generated
public class GetIngredientsGraphQLQuery extends GraphQLQuery {
  public GetIngredientsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public GetIngredientsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "getIngredients";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  @Generated("com.netflix.graphql.dgs.codegen.CodeGen")
  @com.kylej.ai.recipes.graphql.generated.Generated
  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public GetIngredientsGraphQLQuery build() {
      return new GetIngredientsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
