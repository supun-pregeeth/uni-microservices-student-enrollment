package com.ruhuna.student_service.service;

import com.ruhuna.student_service.entity.Student;
import com.ruhuna.student_service.dto.*;
import com.ruhuna.student_service.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository=repository;
    }

    public StudentResponse create(Long userid, StudentCreateRequest dto){
        if(repository.existsByUserid(userid)){
            return new StudentResponse("Profile already exists");
        }

        if(repository.existsByRegno(dto.getRegno())){
            return new StudentResponse("RegNo already exists");
        }

        Student student1 = new Student();

        student1.setBatch(dto.getBatch());
        student1.setFullname(dto.getFullname());
        student1.setDepartment(dto.getDepartment());
        student1.setPhone(dto.getPhone());
        student1.setRegno(dto.getRegno());
        student1.setUserid(userid);
        student1.setStatus("ACTIVE");

        Student saved =  repository.save(student1);

        return new StudentResponse("Create profile successful");
    }

   /* // Get by studentId
    public Student getById(Long id) {

        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // Get by userId
    public Student getByUserId(Long userId) {

        return repo.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Profile not found"));
    }*/

}
