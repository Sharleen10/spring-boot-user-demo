package com.example.demo.service;

/**
 * Interface defining the User Service methods.
 */
public interface UserService {

    /**
     * Adds a new user to the system
     *
     * @param name The user's first name
     * @param surname The user's last name
     * @return The name of the added user
     */
    String addUser(String name, String surname);

    /**
     * Gets a user by their ID
     *
     * @param id The user's ID
     * @return The name of the user, or null if user not found
     */
    String getUser(long id);

    /**
     * Removes a user from the system
     *
     * @param id The ID of the user to remove
     * @return The name of the removed user, or null if user not found
     */
    String removeUser(long id);
}
