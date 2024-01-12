package com.woah.community.controllers;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome to the Community!";
    }

    @PreAuthorize("hasRole('MEMBER')")
    @GetMapping("/member")
    public String member() {
        return "Welcome to the Community, Member!";
    }

    @PreAuthorize("hasRole('SHARP')")
    @GetMapping("/sharp")
    public String sharp() {
        return "Welcome to the Community, Sharp!";
    }
}
