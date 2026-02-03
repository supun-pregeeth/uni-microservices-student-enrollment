package com.ruhuna.auth_service.logindto;

import lombok.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor

public class LoginRequest {

    @Email @NotBlank
    private String email;

    @NotBlank
    private String password;

}
