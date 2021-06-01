package com.codurance.katalyst.kickstart.service;

import com.codurance.katalyst.kickstart.model.User;
import com.codurance.katalyst.kickstart.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public int createNewUser(User newUser) throws DuplicateUserException {
        if (userRepository.getUser(newUser.getUserName()) != null) {
            throw new DuplicateUserException("User with name " + newUser.getUserName() + " is already registered");
        }

        return userRepository.add(newUser);
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
