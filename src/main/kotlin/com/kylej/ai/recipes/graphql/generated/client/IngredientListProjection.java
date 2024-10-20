package com.kylej.ai.recipes.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.generated.Generated
public class IngredientListProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public IngredientListProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("IngredientList"));
  }

  public IngredientListProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientProjection<IngredientListProjection<PARENT, ROOT>, ROOT> ingredients() {
     IngredientProjection<IngredientListProjection<PARENT, ROOT>, ROOT> projection = new IngredientProjection<>(this, getRoot());
     getFields().put("ingredients", projection);
     return projection;
  }

  public IngredientListProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
