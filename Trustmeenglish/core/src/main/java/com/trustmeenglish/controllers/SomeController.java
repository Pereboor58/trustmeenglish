package com.trustmeenglish.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping
    public String sayHello(){
            return "Hello world";
    }
}
