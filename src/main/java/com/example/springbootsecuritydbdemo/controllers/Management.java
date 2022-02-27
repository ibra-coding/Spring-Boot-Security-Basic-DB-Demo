package com.example.springbootsecuritydbdemo.controllers;

import com.example.springbootsecuritydbdemo.services.MyUserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/management")
public class Management {

    private final MyUserService myUserService;

    public Management(MyUserService myUserService) {
        this.myUserService = myUserService;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String auth() {
        return "YOU ARE OK";
    }
}
