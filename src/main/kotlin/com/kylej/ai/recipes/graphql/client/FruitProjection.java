package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class FruitProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FruitProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Fruit"));
  }

  public FruitProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
