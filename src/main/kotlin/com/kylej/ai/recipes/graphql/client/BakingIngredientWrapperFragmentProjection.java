package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class BakingIngredientWrapperFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public BakingIngredientWrapperFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BakingIngredientWrapper"));
  }

  public BakingIngredientWrapperFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BakingIngredientProjection<BakingIngredientWrapperFragmentProjection<PARENT, ROOT>, ROOT> bakingIngredient(
      ) {
     BakingIngredientProjection<BakingIngredientWrapperFragmentProjection<PARENT, ROOT>, ROOT> projection = new BakingIngredientProjection<>(this, getRoot());
     getFields().put("bakingIngredient", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on BakingIngredientWrapper {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
