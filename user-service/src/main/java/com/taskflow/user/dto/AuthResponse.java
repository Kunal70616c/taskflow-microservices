package com.taskflow.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    //AuthResponse = What server sends when logging in (token)
    //This Dto is used to validate the data sent by the client

    private String token; // JWT Token
    private UUID userId;
    private String userName;
    private String role;
    private String email;
    private long expiresAt;

}
