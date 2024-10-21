package com.kylej.ai.recipes.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.generated.Generated
public class GetIngredientsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GetIngredientsProjectionRoot() {
    super(null, null, java.util.Optional.of("Ingredient"));
  }

  public GetIngredientsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientCategoryProjection<GetIngredientsProjectionRoot<PARENT, ROOT>, GetIngredientsProjectionRoot<PARENT, ROOT>> category(
      ) {
    IngredientCategoryProjection<GetIngredientsProjectionRoot<PARENT, ROOT>, GetIngredientsProjectionRoot<PARENT, ROOT>> projection = new IngredientCategoryProjection<>(this, this);    
    getFields().put("category", projection);
    return projection;
  }

  public GetIngredientsProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GetIngredientsProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
