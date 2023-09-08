package bg.softuni.springrepositories.repositories;

import bg.softuni.springrepositories.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findByNameStartingWith(String name);

}
