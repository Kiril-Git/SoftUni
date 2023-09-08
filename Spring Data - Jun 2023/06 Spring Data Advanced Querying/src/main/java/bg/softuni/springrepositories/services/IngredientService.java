package bg.softuni.springrepositories.services;

import bg.softuni.springrepositories.entities.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> findByName(String name);
}
