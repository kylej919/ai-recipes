package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class CreateRecipeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CreateRecipeProjectionRoot() {
    super(null, null, java.util.Optional.of("Recipe"));
  }

  public CreateRecipeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientProjection<CreateRecipeProjectionRoot<PARENT, ROOT>, CreateRecipeProjectionRoot<PARENT, ROOT>> ingredients(
      ) {
    IngredientProjection<CreateRecipeProjectionRoot<PARENT, ROOT>, CreateRecipeProjectionRoot<PARENT, ROOT>> projection = new IngredientProjection<>(this, this);    
    getFields().put("ingredients", projection);
    return projection;
  }

  public CreateRecipeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CreateRecipeProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CreateRecipeProjectionRoot<PARENT, ROOT> instructions() {
    getFields().put("instructions", null);
    return this;
  }
}
