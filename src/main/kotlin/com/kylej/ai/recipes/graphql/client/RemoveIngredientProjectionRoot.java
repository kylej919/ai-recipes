package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class RemoveIngredientProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RemoveIngredientProjectionRoot() {
    super(null, null, java.util.Optional.of("IngredientList"));
  }

  public RemoveIngredientProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientProjection<RemoveIngredientProjectionRoot<PARENT, ROOT>, RemoveIngredientProjectionRoot<PARENT, ROOT>> ingredients(
      ) {
    IngredientProjection<RemoveIngredientProjectionRoot<PARENT, ROOT>, RemoveIngredientProjectionRoot<PARENT, ROOT>> projection = new IngredientProjection<>(this, this);    
    getFields().put("ingredients", projection);
    return projection;
  }

  public RemoveIngredientProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
