package org.softuni.repository;

import org.softuni.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class InMemoryUserRepository implements UserRepository{

    public List<User> findAll(){
        return List.of(
                new User("Dido", "Stankov", 19),
                new User("Ivo", "Andonov", 20),
                new User("Jordan", "Gogovski", 18)

        );
    }
}
