package com.kylej.ai.recipes.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.generated.Generated
public class StartIngredientSelectionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StartIngredientSelectionProjectionRoot() {
    super(null, null, java.util.Optional.of("IngredientList"));
  }

  public StartIngredientSelectionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientProjection<StartIngredientSelectionProjectionRoot<PARENT, ROOT>, StartIngredientSelectionProjectionRoot<PARENT, ROOT>> ingredients(
      ) {
    IngredientProjection<StartIngredientSelectionProjectionRoot<PARENT, ROOT>, StartIngredientSelectionProjectionRoot<PARENT, ROOT>> projection = new IngredientProjection<>(this, this);    
    getFields().put("ingredients", projection);
    return projection;
  }

  public StartIngredientSelectionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
