package com.ruhuna.auth_service.responsedto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor


public class AuthResponse {

    private  String text;
    private Long id;
    private String email;
    private String role;

    public AuthResponse(String text){
        this.text = text;
    }

}



