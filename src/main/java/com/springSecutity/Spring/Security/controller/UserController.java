package com.springSecutity.Spring.Security.controller;


import com.springSecutity.Spring.Security.model.User;
import com.springSecutity.Spring.Security.repo.UserRepo;
import com.springSecutity.Spring.Security.service.JwtService;
import com.springSecutity.Spring.Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService service;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtService jwtService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
         return service.saveUser(user);
    };

    @PostMapping("/login")
    public String login(@RequestBody User user){

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword()
                )
        );

        if(authentication.isAuthenticated()) return jwtService.generateToken(user.getUsername());
        else return "LOGIN FAILED!!";
    };
}
