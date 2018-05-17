package ru.alexsumin.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.alexsumin.spring5recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
