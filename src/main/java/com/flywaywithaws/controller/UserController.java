package com.flywaywithaws.controller;

import com.flywaywithaws.entity.User;
import com.flywaywithaws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository UserRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return UserRepository.findAll();
    }

    @PostMapping
    public User createUser(User user) {
        return UserRepository.save(user);
    }
}
