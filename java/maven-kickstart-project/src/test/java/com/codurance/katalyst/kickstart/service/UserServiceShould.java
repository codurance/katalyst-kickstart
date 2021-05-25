package com.codurance.katalyst.kickstart.service;

import com.codurance.katalyst.kickstart.Calculator;
import com.codurance.katalyst.kickstart.model.User;
import com.codurance.katalyst.kickstart.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceShould {

    @Mock
    private UserRepository mockedUserRepository;

    private UserService userService;
    private User testUser;


    @Before
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
    @Test(expected = DuplicateUserException.class)
    public void throwExceptionWhenAttemtsToAddExistingUser() throws DuplicateUserException {
        when(mockedUserRepository.getUser(testUser.getUserName())).thenReturn(new User());

        userService.createNewUser(testUser);
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
