package com.spring.basics.webapp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String userId, String password){
       return userId.equalsIgnoreCase("rahim") && password.equalsIgnoreCase("pwd");
    }
    
}

