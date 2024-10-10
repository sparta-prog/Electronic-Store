package com.lcwd.electronic.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeControllers {

    @GetMapping
    public String testing() {
        return "Welcome testing the e store";
    }
}
