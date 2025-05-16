package com.example.demo.service;

import com.example.demo.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;


/**
 * Implementation of the UserService interface.
 */

@Service
public class UserServiceImpl implements UserService{
    private final FakeRepoInterface fakeRepo;
    private final Random random = new Random();

    /**
     * Constructor injection for the FakeRepoInterface dependency.
     * The @Autowired annotation tells Spring to inject an implementation of FakeRepoInterface.
     *
     * @param fakeRepo An implementation of FakeRepoInterface
     */
    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    /**
     * Adds a new user with a generated ID
     *
     * @param name The user's first name
     * @param surname The user's last name
     * @return The name of the added user
     */
    @Override
    public String addUser(String name, String surname) {
        // Generate a random ID between 1 and 1000
        long id = random.nextInt(1000) + 1;
        String addedName = fakeRepo.insertUser(id, name, surname);
        System.out.println(addedName + " added");
        return addedName;
    }

    /**
     * Gets a user by ID
     *
     * @param id The user's ID
     * @return The name of the user, or null if user not found
     */
    @Override
    public String getUser(long id) {
        String userName = fakeRepo.findUserById(id);
        if (userName != null) {
            System.out.println("Greetings " + userName);
        } else {
            System.out.println("User with ID " + id + " not found");
        }
        return userName;
    }

    /**
     * Removes a user by ID
     *
     * @param id The ID of the user to remove
     * @return The name of the removed user, or null if user not found
     */
    @Override
    public String removeUser(long id) {
        String removedName = fakeRepo.deleteUser(id);
        if (removedName != null) {
            System.out.println(removedName + " removed");
        } else {
            System.out.println("User with ID " + id + " not found");
        }
        return removedName;
    }
}
