package com.spring.basics.webapp.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String loginMessage(){
        return "Hello World!";
    }
}
