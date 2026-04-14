package com.gameversehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDateTime;

import com.gameversehub.model.Score;
import com.gameversehub.repository.ScoreRepository;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    // 🔹 SAVE SCORE (after game ends)
    public Score saveScore(Score score) {
        score.setCreatedAt(LocalDateTime.now());
        return scoreRepository.save(score);
    }

    // 🔹 GET ALL SCORES
    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    // 🔹 GET SCORES BY GAME (Leaderboard)
    public List<Score> getScoresByGame(Long gameId) {
        return scoreRepository.findByGameIdOrderByScoreDesc(gameId);
    }

    // 🔹 GET SCORES BY USER
    public List<Score> getScoresByUser(Long userId) {
        return scoreRepository.findByUserId(userId);
    }

    // 🔹 DELETE SCORE (optional admin)
    public void deleteScore(Long id) {
        scoreRepository.deleteById(id);
    }
}