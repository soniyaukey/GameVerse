package com.gameversehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.gameversehub.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    // 🔹 Find reviews by game
    List<Review> findByGameId(Long gameId);

    // 🔹 Find reviews by user
    List<Review> findByUserId(Long userId);
}