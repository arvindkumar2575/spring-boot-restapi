package com.arvindkumar2575.usermanagement.services.Impl;

import com.arvindkumar2575.usermanagement.entities.User;
import com.arvindkumar2575.usermanagement.repositories.UserRepository;
import com.arvindkumar2575.usermanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
