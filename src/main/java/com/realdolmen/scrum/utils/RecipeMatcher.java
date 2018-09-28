package com.realdolmen.scrum.utils;

import com.realdolmen.scrum.domain.Ingredient;
import com.realdolmen.scrum.domain.Recipe;

import java.util.Collection;

public class RecipeMatcher {

    public boolean canMake(Collection<Ingredient> ingredients, Recipe recipe) {

        return ingredients.containsAll(recipe.getIngredients());

    }
}
