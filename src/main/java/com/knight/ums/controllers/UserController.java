package com.knight.ums.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserController {

    public String greeting = "Hello How are you ";
    public int count = 0;
    @Value("${version}")
    public String config;

    @GetMapping("/greeting")
    public String getGreeting(){
        return greeting + count++ +"th call" + "  version " + config;
    }
}