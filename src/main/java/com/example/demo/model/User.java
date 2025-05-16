package com.example.demo.model;

/**
 * User model class representing a user entity.
 * Contains id, name and surname fields with getters and setters.
 */

public class User {
    private long id;
    private String name;
    private String surname;

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * Parameterized constructor
     *
     * @param id The user's ID
     * @param name The user's first name
     * @param surname The user's last name
     */
    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    /**
     * Get the user's ID
     *
     * @return The user's ID
     */
    public long getId() {
        return id;
    }

    /**
     * Set the user's ID
     *
     * @param id The user's ID
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the user's first name
     *
     * @return The user's first name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the user's first name
     *
     * @param name The user's first name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the user's last name
     *
     * @return The user's last name
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the user's last name
     *
     * @param surname The user's last name
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

}
