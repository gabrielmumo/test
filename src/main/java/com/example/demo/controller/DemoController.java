package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-demo")
public class DemoController {

    @GetMapping("only-admin")
    public ResponseEntity<String> checkOnlyAdmins() {

        return ResponseEntity.ok("Executed");
    }
}
