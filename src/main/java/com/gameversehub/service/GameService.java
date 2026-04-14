package com.gameversehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.gameversehub.model.Game;
import com.gameversehub.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    // 🔹 GET ALL GAMES
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    // 🔹 GET GAME BY ID
    public Optional<Game> getGameById(Long id) {
        return gameRepository.findById(id);
    }

    // 🔹 SAVE GAME (Add / Update)
    public Game saveGame(Game game) {

        // 🔥 LOGIC: VALIDATE GAME TYPE
        if ("ONLINE".equalsIgnoreCase(game.getGameType())) {
            game.setGamePath(null); // no local file
        } 
        else if ("OFFLINE".equalsIgnoreCase(game.getGameType())) {
            game.setGameUrl(null); // no external link
        }

        return gameRepository.save(game);
    }

    // 🔹 DELETE GAME
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }

    // 🔥 GET PLAY URL (IMPORTANT LOGIC)
    public String getPlayUrl(Long id) {

        Optional<Game> gameOpt = gameRepository.findById(id);

        if (gameOpt.isPresent()) {
            Game game = gameOpt.get();

            // 🎮 OFFLINE GAME
            if ("OFFLINE".equalsIgnoreCase(game.getGameType())) {
                return "/games/" + game.getGamePath() + "/index.html";
            }

            // 🌐 ONLINE GAME
            else if ("ONLINE".equalsIgnoreCase(game.getGameType())) {
                return game.getGameUrl();
            }
        }

        return "Game not found";
    }
}