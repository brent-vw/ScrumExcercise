package com.realdolmen.scrum.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Recipe {

    private final Set<Ingredient> ingredients;
    private final String name;

    public Recipe(String name) {
        this.ingredients = new HashSet<>();
        this.name = name;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public void setIngredients(Ingredient... ingredients) {
        this.ingredients.addAll(Arrays.asList(ingredients));
    }
}
