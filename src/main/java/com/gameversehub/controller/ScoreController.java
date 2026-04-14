package com.gameversehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.gameversehub.model.Score;
import com.gameversehub.service.ScoreService;

@RestController
@RequestMapping("/api/scores")
@CrossOrigin("*")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    // 🔹 ADD SCORE (when user finishes game)
    @PostMapping
    public Score addScore(@RequestBody Score score) {
        return scoreService.saveScore(score);
    }

    // 🔹 GET ALL SCORES
    @GetMapping
    public List<Score> getAllScores() {
        return scoreService.getAllScores();
    }

    // 🔹 GET SCORES BY GAME (Leaderboard)
    @GetMapping("/game/{gameId}")
    public List<Score> getScoresByGame(@PathVariable Long gameId) {
        return scoreService.getScoresByGame(gameId);
    }

    // 🔹 GET SCORES BY USER
    @GetMapping("/user/{userId}")
    public List<Score> getScoresByUser(@PathVariable Long userId) {
        return scoreService.getScoresByUser(userId);
    }
}
