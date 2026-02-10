package com.taskflow.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    //RegisterRequest = What client sends when registering (username, email, password)
    //This Dto is used to validate the data sent by the client

    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 30, message = "Username must be between 3 and 20 characters")
    private String userName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email is invalid") // @Email is used to validate email format
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    @NotBlank(message = "Role is required") // Admin or User
    private String role;
}
