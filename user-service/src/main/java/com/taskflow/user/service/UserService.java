package com.taskflow.user.service;

import com.taskflow.user.dto.AuthResponse;
import com.taskflow.user.dto.LoginRequest;
import com.taskflow.user.dto.RegisterRequest;
import com.taskflow.user.models.User;

import java.util.UUID;

public interface UserService {

    User registerUser(RegisterRequest request);

    AuthResponse login(LoginRequest request);

    User getUserById(UUID userId);

    User getUserByUsername(String username);
}