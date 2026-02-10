package com.taskflow.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    //LoginRequest = What client sends when logging in (username, password)
    //This Dto is used to validate the data sent by the client

    @NotBlank(message = "Username is required")
    private String userName;

    @NotBlank(message = "Password is required")
    private String password;
}
