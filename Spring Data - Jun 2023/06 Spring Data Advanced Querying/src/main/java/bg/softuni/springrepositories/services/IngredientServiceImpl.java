package bg.softuni.springrepositories.services;

import bg.softuni.springrepositories.entities.Ingredient;
import bg.softuni.springrepositories.repositories.IngredientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientServiceImpl implements IngredientService {

    private IngredientsRepository ingredientsRepository;

    public IngredientServiceImpl(IngredientsRepository ingredientsRepository) {
        this.ingredientsRepository = ingredientsRepository;
    }

    @Override
    public List<Ingredient> findByName(String name) {
        return ingredientsRepository.findByNameStartingWith(name);
    }
}
