package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


/**
 * Implementation of the FakeRepoInterface that simulates a database repository
 * using an in-memory list of User objects.
 */
@Repository
public class FakeRepo implements FakeRepoInterface {


    private final List<User> users = new ArrayList<>(); // In-memory storage for User objects

    /**
     * Inserts a new user into the repository
     *
     * @param id The user's ID
     * @param name The user's first name
     * @param surname The user's last name
     * @return The name of the inserted user
     */
    @Override
    public String insertUser(long id, String name, String surname) {
        User user = new User(id, name, surname);
        users.add(user);
        return name;
    }

    /**
     * Finds a user by their ID
     *
     * @param id The user's ID
     * @return The name of the found user, or null if not found
     */
    @Override
    public String findUserById(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user.getName();
            }
        }
        return null;
    }

    /**
     * Deletes a user from the repository
     *
     * @param id The ID of the user to delete
     * @return The name of the deleted user, or null if not found
     */
    @Override
    public String deleteUser(long id) {
        User userToRemove = null;
        String userName = null;

        for (User user : users) {
            if (user.getId() == id) {
                userToRemove = user;
                userName = user.getName();
                break;
            }
        }

        if (userToRemove != null) {
            users.remove(userToRemove);
        }

        return userName;
    }
}
