package com.ruhuna.auth_service.service;

import com.ruhuna.auth_service.repo.UserRepository;
import com.ruhuna.auth_service.entity.AppUser;
import com.ruhuna.auth_service.responsedto.*;
import com.ruhuna.auth_service.logindto.*;
import com.ruhuna.auth_service.registerdto.*;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;  //THIS IS DEPENDENCY INJECTION
    //private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AuthResponse register(RegisterRequest dto){

        if(userRepository.existsByEmail(dto.getEmail().trim().toLowerCase())){
            return new AuthResponse("Email is already exist");
        }

        AppUser user = new AppUser();
        user.setEmail(dto.getEmail());
        //user.setPassword(encoder.encode(dto.getPassword()));
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());

        AppUser usersaved = userRepository.save(user);

        return new AuthResponse("Sign up is success - " + usersaved.getEmail());

        //return new AuthResponse(usersaved.getId(),usersaved.getEmail(),usersaved.getRole());
    }

    public AuthResponse login(LoginRequest dto){

        Optional<AppUser> optionaluser = userRepository.findByEmail(dto.getEmail());

        if(optionaluser.isEmpty()){
            return new AuthResponse("Invalid email or password");
        }

        AppUser user = optionaluser.get();

        /*if(!encoder.matches(dto.getPassword(),user.getPassword())){
            return new AuthResponse("Invalid email or password");
        }*/

        if (!dto.getPassword().equals(user.getPassword())) {
            return new AuthResponse("Invalid email or password");
        }


        return new AuthResponse("Login Successful");


    }




}
