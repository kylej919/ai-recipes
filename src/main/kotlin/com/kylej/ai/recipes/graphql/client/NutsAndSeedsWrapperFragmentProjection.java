package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class NutsAndSeedsWrapperFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public NutsAndSeedsWrapperFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("NutsAndSeedsWrapper"));
  }

  public NutsAndSeedsWrapperFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public NutsAndSeedsProjection<NutsAndSeedsWrapperFragmentProjection<PARENT, ROOT>, ROOT> nutsAndSeeds(
      ) {
     NutsAndSeedsProjection<NutsAndSeedsWrapperFragmentProjection<PARENT, ROOT>, ROOT> projection = new NutsAndSeedsProjection<>(this, getRoot());
     getFields().put("nutsAndSeeds", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on NutsAndSeedsWrapper {");
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
