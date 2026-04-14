package com.gameversehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.gameversehub.model.Score;

public interface ScoreRepository extends JpaRepository<Score, Long> {

    // 🔹 Find scores by game (Leaderboard)
    List<Score> findByGameIdOrderByScoreDesc(Long gameId);

    // 🔹 Find scores by user
    List<Score> findByUserId(Long userId);
}