package com.ruhuna.student_service.controller;

import com.ruhuna.student_service.service.StudentService;
import com.ruhuna.student_service.dto.*;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){

        this.service=service;
    }

    @PostMapping
    public StudentResponse createstudent(
            @Valid @RequestBody StudentCreateRequest dto,
            @RequestHeader("X-USER-ID") Long userid
    ){

        return service.create( userid,dto);
    }

    /*// Get by id
    @GetMapping("/{id}")
    public Student get(@PathVariable Long id) {
        return service.getById(id);
    }

    // Get my profile
    @GetMapping("/me")
    public Student me(HttpServletRequest req) {

        Long userId = Long.parseLong(req.getHeader("X-USER-ID"));

        return service.getByUserId(userId);
    }*/
}
