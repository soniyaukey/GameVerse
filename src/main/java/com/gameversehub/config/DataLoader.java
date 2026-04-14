package com.gameversehub.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gameversehub.model.Game;
import com.gameversehub.repository.GameRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(GameRepository gameRepository) {
        return args -> {

            // 🔹 Prevent duplicate data
            if (gameRepository.count() > 0) {
                return;
            }

            // OFFLINE GAMES
            
            gameRepository.save(new Game(
                    "Snake Game",
                    "Classic snake game",
                    "Arcade",
                    "C:\\Users\\HRITHIK\\Downloads\\gameversehub\\gameversehub\\src\\main\\resources\\static\\images\\king-snake-white.jpg",
                    "OFFLINE",
                    null,
                    "snake",
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Tic Tac Toe",
                    "2 Player strategy game",
                    "Puzzle",
"https://cdn-icons-png.flaticon.com/512/1255/1255333.png",
                    "OFFLINE",
                    null,
                    "tic-tac-toe",
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Memory Game",
                    "Match cards and test memory",
                    "Puzzle",
"https://cdn-icons-png.flaticon.com/512/2875/2875407.png",
                    "OFFLINE",
                    null,
                    "memory",
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "🧱 Block Puzzle",
                    "Complete rows/columns - Tetris Style",
                    "Puzzle",
"https://cdn-icons-png.flaticon.com/512/10647/10647348.png",
                    "OFFLINE",
                    null,
                    "block",
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Rock Paper Scissors",
                    "Classic hand game",
                    "Fun",
"https://cdn-icons-png.flaticon.com/512/3193/3193068.png",
                    "OFFLINE",
                    null,
                    "rps",
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Quiz Game",
                    "Answer questions",
                    "Educational",
"https://cdn-icons-png.flaticon.com/512/4643/4643063.png",
                    "OFFLINE",
                    null,
                    "quiz",
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Whack-a-Mole",
                    "Hit the mole fast",
                    "Arcade",
"https://cdn-icons-png.flaticon.com/512/10824/10824748.png",
                    "OFFLINE",
                    null,
                    "whack",
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Number Guess",
                    "Guess the number",
                    "Puzzle",
"https://cdn-icons-png.flaticon.com/512/484/484662.png",
                    "OFFLINE",
                    null,
                    "number",
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Breakout",
                    "Brick breaking game",
                    "Arcade",
"https://cdn-icons-png.flaticon.com/512/7330/7330634.png",
                    "OFFLINE",
                    null,
                    "breakout",
                    "admin",
                    "APPROVED"
            ));

            // =========================
            // 🌐 ONLINE GAMES
            // =========================

            gameRepository.save(new Game(
                    "Subway Surfers",
                    "Endless runner game",
                    "Arcade",
"https://img.pokigamescdn.com/poki-games/subway-surfers.jpg",
                    "ONLINE",
                    "https://poki.com/en/g/subway-surfers",
                    null,
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Temple Run 2",
                    "Adventure running game",
                    "Adventure",
                    "https://img.pokigamescdn.com/poki-games/temple-run-2.jpg",
                    "ONLINE",
                    "https://poki.com/en/g/temple-run-2",
                    null,
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Moto X3M",
                    "Bike racing game",
                    "Racing",
                    "https://img.crazygames.com/crazygames/moto-x3m.jpg",
                    "ONLINE",
                    "https://www.crazygames.com/game/moto-x3m",
                    null,
                    "admin",
                    "APPROVED"
            ));

            gameRepository.save(new Game(
                    "Stickman Hook",
                    "Swing action game",
                    "Action",
                    "https://img.pokigamescdn.com/poki-games/stickman-hook.jpg",
                    "ONLINE",
                    "https://poki.com/en/g/stickman-hook",
                    null,
                    "admin",
                    "APPROVED"
            ));

            System.out.println("🔥 Sample Games Loaded Successfully!");
        };
    }
}