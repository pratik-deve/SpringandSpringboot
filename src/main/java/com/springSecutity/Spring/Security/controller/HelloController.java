package com.springSecutity.Spring.Security.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String greet(){
        return "HELLO WORLD!!";
    }

    @GetMapping("/getSId")
    public String getSId(HttpServletRequest req){
        return req.getSession().getId();
    }
}
