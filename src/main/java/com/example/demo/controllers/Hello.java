package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok("Hello spring");
    }
}
