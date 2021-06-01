package com.codurance.katalyst.kickstart.repository;

import com.codurance.katalyst.kickstart.model.User;

public interface UserRepository {
    User getUser(String userName);

    int add(User newUser);
}
