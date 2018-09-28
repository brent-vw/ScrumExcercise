package com.realdolmen.scrum.persistence;

import com.realdolmen.scrum.domain.Ingredient;
import com.realdolmen.scrum.domain.Recipe;

import javax.ejb.Stateless;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Stateless
public class InMemoryData implements Repository {

    private final List<Ingredient> ingredientList;
    private final List<Recipe> recipes;

    public InMemoryData() {
        ingredientList = new ArrayList<>();
        recipes = new ArrayList<>();
        init();
    }

    @Override
    public Collection<Ingredient> getIngredients() {
        return ingredientList;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void init() {
        Map<String, Ingredient> ingredients = Stream.of("tomato", "potato", "cheese", "carrots", "milk", "eggs", "bacon", "ham")
                .map(Ingredient::new)
                .collect(Collectors.toMap(Ingredient::getName, Function.identity(), (a, b) -> a));
        ingredientList.addAll(ingredients.values());

        Recipe macNchees = new Recipe("Macaroni And Cheese");
        macNchees.setIngredients(ingredients.get("cheese"), ingredients.get("ham"));

        Recipe baconNeggs = new Recipe("Bacon and eggs");
        baconNeggs.setIngredients(ingredients.get("bacon"), ingredients.get("eggs"));

        Recipe tomatoCheeseToast = new Recipe("Tomato and Cheese");
        tomatoCheeseToast.setIngredients(ingredients.get("tomato"), ingredients.get("cheese"));

        Recipe cheeseCarrotSticks = new Recipe("Carrots and cheese");
        cheeseCarrotSticks.setIngredients(ingredients.get("carrots"), ingredients.get("cheese"));

        recipes.add(macNchees);
        recipes.add(baconNeggs);
    }

}
