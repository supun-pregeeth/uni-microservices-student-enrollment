package com.ruhuna.auth_service.responsedto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor


public class AuthResponse {

    private Long id;
    private String email;
    private String role;

}
