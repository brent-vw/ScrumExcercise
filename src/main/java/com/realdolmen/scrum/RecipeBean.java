package com.realdolmen.scrum;

import com.realdolmen.scrum.domain.Ingredient;
import com.realdolmen.scrum.domain.Recipe;
import com.realdolmen.scrum.persistence.Repository;
import com.realdolmen.scrum.utils.RecipeMatcher;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Named
@RequestScoped
public class RecipeBean {
    @Inject
    Repository repository;

    private List<Recipe> allRecipes;
    private List<Ingredient> allIngredients;
    private List<Recipe> match;
    private List<Ingredient> selected;
    private RecipeMatcher matcher;

    @PostConstruct
    public void init() {
        allRecipes = repository.getRecipes();
        allIngredients = repository.getIngredients();

        match = new ArrayList<>();
        matcher = new RecipeMatcher();
        selected = new ArrayList<>();
    }

    public List<Recipe> getAllRecipes() {
        return allRecipes;
    }

    public List<Ingredient> getAllIngredients() {
        return allIngredients;
    }

    public List<Recipe> getMatch() {
        return match;
    }

    public void search() {
        match = allRecipes.stream()
                .filter(r -> matcher.canMake(selected, r))
                .collect(Collectors.toList());
    }
}
