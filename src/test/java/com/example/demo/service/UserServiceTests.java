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

    /**
     * Test for the getUser method when user exists
     */
    @Test
    void testGetUserWhenUserExists() {
        // Arrange
        long userId = 1L;
        String userName = "Leen";
        when(fakeRepo.findUserById(userId)).thenReturn(userName);

        // Act
        String result = userService.getUser(userId);

        // Assert
        assertEquals(userName, result);
        verify(fakeRepo, times(1)).findUserById(userId);
    }

    /**
     * Test for the getUser method when user does not exist
     */
    @Test
    void testGetUserWhenUserDoesNotExist() {
        // Arrange
        long userId = 999L;
        when(fakeRepo.findUserById(userId)).thenReturn(null);

        // Act
        String result = userService.getUser(userId);

        // Assert
        assertNull(result);
        verify(fakeRepo, times(1)).findUserById(userId);
    }

    /**
     * Test for the removeUser method when user exists
     */
    @Test
    void testRemoveUserWhenUserExists() {
        // Arrange
        long userId = 1L;
        String userName = "Leen";
        when(fakeRepo.deleteUser(userId)).thenReturn(userName);

        // Act
        String result = userService.removeUser(userId);

        // Assert
        assertEquals(userName, result);
        verify(fakeRepo, times(1)).deleteUser(userId);
    }

    /**
     * Test for the removeUser method when user does not exist
     */
    @Test
    void testRemoveUserWhenUserDoesNotExist() {
        // Arrange
        long userId = 999L;
        when(fakeRepo.deleteUser(userId)).thenReturn(null);

        // Act
        String result = userService.removeUser(userId);

        // Assert
        assertNull(result);
        verify(fakeRepo, times(1)).deleteUser(userId);
    }


}
