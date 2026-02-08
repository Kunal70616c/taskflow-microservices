package com.taskflow.user.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", schema = "user_service")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID userId;

    @Column(unique = true,nullable = false,length = 20)
    private String userName;

    @Column(unique = true,nullable = false,length = 100)
    private String email;

    @Column(name = "password_hash",nullable = false)
    private String passwordHash;

    @Column(nullable = false,length = 20)
    private String role;

    @Column(name = "created_at", nullable = false,length = 50)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDateTime.now();
    }

}
