package com.springSecutity.Spring.Security.controller;


import com.springSecutity.Spring.Security.model.User;
import com.springSecutity.Spring.Security.repo.UserRepo;
import com.springSecutity.Spring.Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user){
         return service.saveUser(user);
    };
}
