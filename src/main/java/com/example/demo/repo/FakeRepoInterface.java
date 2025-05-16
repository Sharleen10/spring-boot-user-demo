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
}
