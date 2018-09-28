package com.realdolmen.scrum;

import com.realdolmen.scrum.domain.Recipe;
import com.realdolmen.scrum.persistence.Repository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class RecipeBean {
    @Inject
    Repository repository;

    private Recipe recipe;
    private List<Recipe> allRecipes;

    public List<Recipe> getAllRecipes() {
        return allRecipes;
    }

    public void setAllRecipes(List<Recipe> allRecipes) {
        this.allRecipes = allRecipes;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Recipe getRecipe(){
        return null;
    }
}
