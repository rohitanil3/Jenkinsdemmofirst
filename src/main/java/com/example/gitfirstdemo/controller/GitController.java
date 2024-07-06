package com.example.gitfirstdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitController {
    @GetMapping("/name")
    public String getname(){
        return "Hi Ram. .";
    }
    @GetMapping("/hi")
    public String gettingHello(){
        return "Hi Rohit....1234";
    }

}
