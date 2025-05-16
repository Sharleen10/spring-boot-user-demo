package com.example.demo.repo;

/**
 * Interface for the fake repository that simulates database operations.
 */
public interface FakeRepoInterface {

    /**
     * Inserts a new user into the repository
     *
     * @param id The user's ID
     * @param name The user's first name
     * @param surname The user's last name
     * @return The name of the inserted user
     */
    String insertUser(long id, String name, String surname);

    /**
     * Finds a user by their ID
     *
     * @param id The user's ID
     * @return The name of the found user, or null if not found
     */
    String findUserById(long id);

}
