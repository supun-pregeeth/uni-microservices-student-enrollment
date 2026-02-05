package com.ruhuna.auth_service.responsedto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class AuthResponse {


    private Long id;
    private String email;
    private String role;
    private  String text;

    public AuthResponse(String text){
        this.text = text;
    }

    public AuthResponse(Long id, String email, String role) {
        this.id = id;
        this.email = email;
        this.role = role;
    }

}



