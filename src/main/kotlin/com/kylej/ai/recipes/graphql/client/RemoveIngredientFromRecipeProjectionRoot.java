package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class RemoveIngredientFromRecipeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RemoveIngredientFromRecipeProjectionRoot() {
    super(null, null, java.util.Optional.of("Recipe"));
  }

  public RemoveIngredientFromRecipeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientProjection<RemoveIngredientFromRecipeProjectionRoot<PARENT, ROOT>, RemoveIngredientFromRecipeProjectionRoot<PARENT, ROOT>> ingredients(
      ) {
    IngredientProjection<RemoveIngredientFromRecipeProjectionRoot<PARENT, ROOT>, RemoveIngredientFromRecipeProjectionRoot<PARENT, ROOT>> projection = new IngredientProjection<>(this, this);    
    getFields().put("ingredients", projection);
    return projection;
  }

  public RemoveIngredientFromRecipeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RemoveIngredientFromRecipeProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public RemoveIngredientFromRecipeProjectionRoot<PARENT, ROOT> instructions() {
    getFields().put("instructions", null);
    return this;
  }
}
