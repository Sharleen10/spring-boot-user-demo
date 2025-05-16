package com.example.demo.service;

import com.example.demo.repo.FakeRepoInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Unit tests for the UserServiceImpl class.
 * Uses Mockito to mock the FakeRepoInterface dependency.
 */

@SpringBootTest
public class UserServiceTests {

    @Mock
    private FakeRepoInterface fakeRepo;

    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserServiceImpl(fakeRepo);
    }

    /**
     * Test for the addUser method
     */
    @Test
    void testAddUser() {
        // Arrange
        String name = "Leen";
        String surname = "Shabangu";
        when(fakeRepo.insertUser(anyLong(), eq(name), eq(surname))).thenReturn(name);

        // Act
        String result = userService.addUser(name, surname);

        // Assert
        assertEquals(name, result);
        verify(fakeRepo, times(1)).insertUser(anyLong(), eq(name), eq(surname));
    }

}
