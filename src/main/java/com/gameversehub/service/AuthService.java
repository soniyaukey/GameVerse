package com.gameversehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gameversehub.dto.AuthRequest;
import com.gameversehub.dto.AuthResponse;
import com.gameversehub.model.User;
import com.gameversehub.repository.UserRepository;
import com.gameversehub.security.JwtUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

@Autowired
    private JwtUtil jwtUtil;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // 🔹 REGISTER USER
    public AuthResponse register(AuthRequest request) {

        // Check if email already exists
        Optional<User> existingUser = userRepository.findByEmail(request.getEmail());

        if (existingUser.isPresent()) {
            return new AuthResponse("User already exists!", null);
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole("USER");

        userRepository.save(user);

        String token = jwtUtil.generateToken(user.getEmail());
        return new AuthResponse(token, user.getEmail());
    }

    // 🔹 LOGIN USER (JWT)
    public AuthResponse login(AuthRequest request) {

        Optional<User> userOpt = userRepository.findByEmail(request.getEmail());

        if (userOpt.isPresent() && passwordEncoder.matches(request.getPassword(), userOpt.get().getPassword())) {
            User user = userOpt.get();

            String token = jwtUtil.generateToken(user.getEmail());

            return new AuthResponse(token, user.getEmail());
        }

        if (!userOpt.isPresent()) {
            return new AuthResponse("User not found. Please register first.", null);
        }
        return new AuthResponse("Invalid password.", null);
    }
}
