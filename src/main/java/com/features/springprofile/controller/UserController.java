package com.features.springprofile.controller;

import com.features.springprofile.model.User;
import com.features.springprofile.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("")
    public List<User> getUserName(){

        return userRepo.findAll();
    }
}
