package com.kylej.ai.recipes.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.generated.Generated
public class IngredientProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public IngredientProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Ingredient"));
  }

  public IngredientProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IngredientCategoryProjection<IngredientProjection<PARENT, ROOT>, ROOT> category() {
     IngredientCategoryProjection<IngredientProjection<PARENT, ROOT>, ROOT> projection = new IngredientCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public IngredientProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
