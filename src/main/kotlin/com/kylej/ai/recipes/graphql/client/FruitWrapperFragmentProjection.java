package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class FruitWrapperFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FruitWrapperFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FruitWrapper"));
  }

  public FruitWrapperFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FruitProjection<FruitWrapperFragmentProjection<PARENT, ROOT>, ROOT> fruit() {
     FruitProjection<FruitWrapperFragmentProjection<PARENT, ROOT>, ROOT> projection = new FruitProjection<>(this, getRoot());
     getFields().put("fruit", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FruitWrapper {");
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
