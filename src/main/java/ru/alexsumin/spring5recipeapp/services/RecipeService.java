package ru.alexsumin.spring5recipeapp.services;

import ru.alexsumin.spring5recipeapp.commands.RecipeCommand;
import ru.alexsumin.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
