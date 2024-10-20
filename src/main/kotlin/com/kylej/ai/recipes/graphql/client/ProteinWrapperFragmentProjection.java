package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class ProteinWrapperFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProteinWrapperFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProteinWrapper"));
  }

  public ProteinWrapperFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProteinProjection<ProteinWrapperFragmentProjection<PARENT, ROOT>, ROOT> protein() {
     ProteinProjection<ProteinWrapperFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProteinProjection<>(this, getRoot());
     getFields().put("protein", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProteinWrapper {");
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
