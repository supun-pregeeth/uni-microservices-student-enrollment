package com.ruhuna.auth_service.controller;

import com.ruhuna.auth_service.service.AuthService;
import com.ruhuna.auth_service.registerdto.*;
import com.ruhuna.auth_service.logindto.*;
import com.ruhuna.auth_service.responsedto.*;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService Authsevice;

    public AuthController(AuthService Authservice){
        this.Authsevice = Authservice;
    }
}
