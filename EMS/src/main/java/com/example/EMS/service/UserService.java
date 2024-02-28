package com.example.EMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EMS.Repository.UserRepository;
import com.example.EMS.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void signup(User user) {
        // Add logic to save the user to the database
        userRepository.save(user);
    }

    // You can add additional service methods as needed
}

