package com.ruhuna.student_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class StudentCreateRequest {

    @NotBlank(/*message = ""*/)
    private String fullname;

    @NotBlank
    private String regno;

    private String department;

    @NotBlank
    private String batch;

    @NotBlank
    private int phone;

}
