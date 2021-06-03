package com.codurance.katalyst.kickstart.service;

import com.codurance.katalyst.kickstart.model.User;
import com.codurance.katalyst.kickstart.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class UserServiceShould {

    @Mock
    private UserRepository mockedUserRepository;

    private UserService userService;
    private User testUser;


    @BeforeEach
    public void setUp() {
        userService = new UserService();
        userService.setUserRepository(mockedUserRepository);

        testUser = new User();
        testUser.setUserName("testName");
        testUser.setPassword("testPassword");

    }

    /**
     * This test method demonstates how one can configure mocks and
     * how we can test if particular exception was thrown
     * @throws DuplicateUserException
     */
    @Test
    public void throwExceptionWhenAttemtsToAddExistingUser(){
        when(mockedUserRepository.getUser(testUser.getUserName())).thenReturn(new User());

        assertThrows(DuplicateUserException.class, () -> userService.createNewUser(testUser));
    }

    /**
     * This test method demonstrates mock configuration and how
     * one can verify that mock indeed was called
     * @throws DuplicateUserException
     */
    @Test
    public void addNewUser() throws DuplicateUserException {
        final int expectedId = 1;
        when(mockedUserRepository.getUser(testUser.getUserName())).thenReturn(null);
        when(mockedUserRepository.add(testUser)).thenReturn(expectedId);

        final int actualId = userService.createNewUser(testUser);

        assertEquals(expectedId, actualId);
        verify(mockedUserRepository, times(1)).add(testUser);
    }
}
