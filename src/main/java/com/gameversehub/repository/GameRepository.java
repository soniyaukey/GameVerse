package com.gameversehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.gameversehub.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    // 🔹 Find games by type (ONLINE / OFFLINE)
    List<Game> findByGameType(String gameType);

    // 🔹 Find games by category
    List<Game> findByCategory(String category);

    // 🔹 Search games by title
    List<Game> findByTitleContainingIgnoreCase(String title);
}