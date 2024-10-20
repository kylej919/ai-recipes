package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class AddIngredientProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AddIngredientProjectionRoot() {
    super(null, null, java.util.Optional.of("IngredientList"));
  }

  public AddIngredientProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientProjection<AddIngredientProjectionRoot<PARENT, ROOT>, AddIngredientProjectionRoot<PARENT, ROOT>> ingredients(
      ) {
    IngredientProjection<AddIngredientProjectionRoot<PARENT, ROOT>, AddIngredientProjectionRoot<PARENT, ROOT>> projection = new IngredientProjection<>(this, this);    
    getFields().put("ingredients", projection);
    return projection;
  }

  public AddIngredientProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
