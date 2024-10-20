package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class GrainProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GrainProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Grain"));
  }

  public GrainProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
