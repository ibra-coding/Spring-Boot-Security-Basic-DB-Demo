package com.example.springbootsecuritydbdemo.controllers;

import com.example.springbootsecuritydbdemo.security.UserPrincipalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/management")
public class Management {

    private final UserPrincipalService userPrincipalService;

    public Management(UserPrincipalService userPrincipalService) {
        this.userPrincipalService = userPrincipalService;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String auth() {
        return "YOU ARE OK";
    }
}
