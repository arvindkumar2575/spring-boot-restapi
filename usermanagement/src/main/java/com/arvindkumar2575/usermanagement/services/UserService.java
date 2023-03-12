package com.arvindkumar2575.usermanagement.services;

import com.arvindkumar2575.usermanagement.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getUser();
}
