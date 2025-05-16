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
}
