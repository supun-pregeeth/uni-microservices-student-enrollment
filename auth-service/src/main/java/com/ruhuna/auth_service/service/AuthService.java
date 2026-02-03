package com.ruhuna.auth_service.service;

import com.ruhuna.auth_service.repo.UserRepository;
import com.ruhuna.auth_service.entity.AppUser;
import com.ruhuna.auth_service.responsedto.*;
import com.ruhuna.auth_service.logindto.*;
import com.ruhuna.auth_service.registerdto.*;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;  //THIS IS DEPENDENCY INJECTION
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AuthResponse register(RegisterRequest dto){

        if(userRepository.existsByEmail(dto.getEmail().trim().toLowerCase())){
            return new AuthResponse("Email is already exist");
        }

        AppUser user = new AppUser();
        user.setEmail(dto.getEmail());
        user.setPassword(encoder.encode(dto.getPassword()));
        user.setRole(dto.getRole());

        AppUser usersaved = userRepository.save(user);

        return new AuthResponse("Sign up is success - " + usersaved.getEmail());

        //return new AuthResponse(usersaved.getId(),usersaved.getEmail(),usersaved.getRole());


    }




}
