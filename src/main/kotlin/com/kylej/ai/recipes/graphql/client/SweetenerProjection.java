package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class SweetenerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SweetenerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Sweetener"));
  }

  public SweetenerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
