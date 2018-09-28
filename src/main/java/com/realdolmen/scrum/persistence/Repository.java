package com.realdolmen.scrum.persistence;

import com.realdolmen.scrum.domain.Ingredient;
import com.realdolmen.scrum.domain.Recipe;

import java.util.Collection;
import java.util.List;

public interface Repository {


    List<Ingredient> getIngredients();

    List<Recipe> getRecipes();


}
