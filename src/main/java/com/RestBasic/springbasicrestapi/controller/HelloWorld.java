package com.RestBasic.springbasicrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    //get
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello world";
    }

}
