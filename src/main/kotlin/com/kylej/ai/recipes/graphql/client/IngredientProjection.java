package com.kylej.ai.recipes.graphql.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@com.kylej.ai.recipes.graphql.Generated
public class IngredientProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public IngredientProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Ingredient"));
  }

  public IngredientProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FatWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onFatWrapper() {
    FatWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new FatWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DairyWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onDairyWrapper() {
    DairyWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new DairyWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProteinWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onProteinWrapper(
      ) {
    ProteinWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new ProteinWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GrainWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onGrainWrapper() {
    GrainWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new GrainWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public VegetableWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onVegetableWrapper(
      ) {
    VegetableWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new VegetableWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FruitWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onFruitWrapper() {
    FruitWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new FruitWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public HerbSpiceWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onHerbSpiceWrapper(
      ) {
    HerbSpiceWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new HerbSpiceWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SauceCondimentWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onSauceCondimentWrapper(
      ) {
    SauceCondimentWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new SauceCondimentWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SweetenerWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onSweetenerWrapper(
      ) {
    SweetenerWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new SweetenerWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BakingIngredientWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onBakingIngredientWrapper(
      ) {
    BakingIngredientWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new BakingIngredientWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public NutsAndSeedsWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> onNutsAndSeedsWrapper(
      ) {
    NutsAndSeedsWrapperFragmentProjection<IngredientProjection<PARENT, ROOT>, ROOT> fragment = new NutsAndSeedsWrapperFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
