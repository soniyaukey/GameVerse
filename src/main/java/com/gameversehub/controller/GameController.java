package com.gameversehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.gameversehub.model.Game;
import com.gameversehub.service.GameService;

@RestController
@RequestMapping("/api/games")
@CrossOrigin("*")
public class GameController {

    @Autowired
    private GameService gameService;

    // 🔹 GET ALL GAMES
    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    // 🔹 GET GAME BY ID
    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Long id) {
        Optional<Game> game = gameService.getGameById(id);
        return game.orElse(null);
    }

    // 🔹 ADD NEW GAME (Admin/Developer)
    @PostMapping
    public Game addGame(@RequestBody Game game) {
        return gameService.saveGame(game);
    }

    // 🔹 UPDATE GAME
    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game updatedGame) {

        Optional<Game> existing = gameService.getGameById(id);

        if (existing.isPresent()) {
            Game game = existing.get();

            game.setTitle(updatedGame.getTitle());
            game.setDescription(updatedGame.getDescription());
            game.setCategory(updatedGame.getCategory());
            game.setGameType(updatedGame.getGameType());
            game.setGameUrl(updatedGame.getGameUrl());
            game.setGamePath(updatedGame.getGamePath());

            return gameService.saveGame(game);
        } else {
            return null;
        }
    }

    // 🔹 DELETE GAME
    @DeleteMapping("/{id}")
    public String deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
        return "Game deleted successfully";
    }

    // 🔥 IMPORTANT: PLAY GAME LOGIC (ONLINE / OFFLINE)
    @GetMapping("/play/{id}")
    public String playGame(@PathVariable Long id) {

        Optional<Game> gameOpt = gameService.getGameById(id);

        if (gameOpt.isPresent()) {
            Game game = gameOpt.get();

            // 🎮 OFFLINE GAME
            if ("OFFLINE".equalsIgnoreCase(game.getGameType())) {
                return "/games/" + game.getGamePath() + "/index.html";
            }

            // 🌐 ONLINE GAME
            else {
                return game.getGameUrl();
            }
        }

        return "Game not found";
    }
}