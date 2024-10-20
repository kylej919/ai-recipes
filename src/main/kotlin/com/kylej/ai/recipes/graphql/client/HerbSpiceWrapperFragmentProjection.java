package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class HerbSpiceWrapperFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public HerbSpiceWrapperFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("HerbSpiceWrapper"));
  }

  public HerbSpiceWrapperFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public HerbAndSpiceProjection<HerbSpiceWrapperFragmentProjection<PARENT, ROOT>, ROOT> spice() {
     HerbAndSpiceProjection<HerbSpiceWrapperFragmentProjection<PARENT, ROOT>, ROOT> projection = new HerbAndSpiceProjection<>(this, getRoot());
     getFields().put("spice", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on HerbSpiceWrapper {");
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
