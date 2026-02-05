package com.ruhuna.student_service.entity;

import io.micrometer.core.annotation.Counted;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "student")

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;
    
    @Column(nullable = false,unique = true)
    private String regno;

    @Column(nullable = false)
    private String fullname;

    private String department;

    @Column(nullable = false)
    private String batch;

    @Column(nullable = false)
    private int phone;

    @Column(nullable = false)
    private String status;// ACTIVE /PENDING /SUSPENDED

    @Column(nullable = false)
    private Long userid;// from auth-service
}
