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



}
