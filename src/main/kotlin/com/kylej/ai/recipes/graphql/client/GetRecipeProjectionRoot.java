package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class GetRecipeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GetRecipeProjectionRoot() {
    super(null, null, java.util.Optional.of("Recipe"));
  }

  public GetRecipeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientListProjection<GetRecipeProjectionRoot<PARENT, ROOT>, GetRecipeProjectionRoot<PARENT, ROOT>> ingredients(
      ) {
    IngredientListProjection<GetRecipeProjectionRoot<PARENT, ROOT>, GetRecipeProjectionRoot<PARENT, ROOT>> projection = new IngredientListProjection<>(this, this);    
    getFields().put("ingredients", projection);
    return projection;
  }

  public GetRecipeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GetRecipeProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public GetRecipeProjectionRoot<PARENT, ROOT> instructions() {
    getFields().put("instructions", null);
    return this;
  }
}
