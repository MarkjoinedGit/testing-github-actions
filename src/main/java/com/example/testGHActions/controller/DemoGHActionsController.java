package com.example.testGHActions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoGHActionsController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring boot + GitHub Actions. Testing pushing now";
    }
}
