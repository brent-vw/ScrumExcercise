package com.realdolmen.scrum;

@Name
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
