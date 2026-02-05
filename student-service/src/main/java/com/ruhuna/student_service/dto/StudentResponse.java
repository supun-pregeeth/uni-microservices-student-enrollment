package com.ruhuna.student_service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class StudentResponse {

    private Long studentid;

    private String status;

    private String userid;

    private String text;

    public StudentResponse(String text){
        this.text = text;

    }

}

