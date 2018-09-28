package com.realdolmen.scrum.persistence;

import com.realdolmen.scrum.domain.Ingredient;
import com.realdolmen.scrum.domain.Recipe;

import java.util.Collection;

public interface Repository {


    Collection<Ingredient> getIngredients();

    Collection<Recipe> getRecipes();


}
