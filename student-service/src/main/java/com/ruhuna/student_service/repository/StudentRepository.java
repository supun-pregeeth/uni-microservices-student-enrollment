package com.ruhuna.student_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ruhuna.student_service.entity.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findByUserid(Long userid);

    boolean existsByUserid(Long userid);
    boolean existsByRegno(String regno);

}
