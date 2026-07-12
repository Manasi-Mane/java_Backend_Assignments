package com.josh.assignment8_autoconfigurationdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "Welcome to Assignment 8";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Exploring Spring Boot AutoConfiguration";
    }
}
