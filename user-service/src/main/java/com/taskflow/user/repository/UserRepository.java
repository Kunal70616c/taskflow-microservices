package com.taskflow.user.repository;

import com.taskflow.user.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    //findByEmail
    Optional<User> findByEmail(String email);
    //findByUserName
    Optional<User> findByUserName(String userName);

    //existsByEmail
    boolean existsByEmail(String email);

    //existsByUserName
    boolean existsByUserName(String userName);


}
