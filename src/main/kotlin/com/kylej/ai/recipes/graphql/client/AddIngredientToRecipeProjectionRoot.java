package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class AddIngredientToRecipeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AddIngredientToRecipeProjectionRoot() {
    super(null, null, java.util.Optional.of("Recipe"));
  }

  public AddIngredientToRecipeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientProjection<AddIngredientToRecipeProjectionRoot<PARENT, ROOT>, AddIngredientToRecipeProjectionRoot<PARENT, ROOT>> ingredients(
      ) {
    IngredientProjection<AddIngredientToRecipeProjectionRoot<PARENT, ROOT>, AddIngredientToRecipeProjectionRoot<PARENT, ROOT>> projection = new IngredientProjection<>(this, this);    
    getFields().put("ingredients", projection);
    return projection;
  }

  public AddIngredientToRecipeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AddIngredientToRecipeProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AddIngredientToRecipeProjectionRoot<PARENT, ROOT> instructions() {
    getFields().put("instructions", null);
    return this;
  }
}
