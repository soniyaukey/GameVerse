package com.gameversehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.gameversehub.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // 🔹 Find user by email (for login)
    Optional<User> findByEmail(String email);
}