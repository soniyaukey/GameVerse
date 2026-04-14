package com.gameversehub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String category;

    private String imageUrl;

    // 🔥 IMPORTANT
    private String gameType; // OFFLINE / ONLINE

    private String gameUrl;  // for ONLINE games

    private String gamePath; // for OFFLINE games (folder name)

    private String createdBy; // developer/admin

    private String status; // PENDING / APPROVED

    // 🔹 Constructors
    public Game() {
    }

    public Game(String title, String description, String category, String imageUrl,
                String gameType, String gameUrl, String gamePath,
                String createdBy, String status) {

        this.title = title;
        this.description = description;
        this.category = category;
        this.imageUrl = imageUrl;
        this.gameType = gameType;
        this.gameUrl = gameUrl;
        this.gamePath = gamePath;
        this.createdBy = createdBy;
        this.status = status;
    }

    // 🔹 Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameUrl() {
        return gameUrl;
    }

    public void setGameUrl(String gameUrl) {
        this.gameUrl = gameUrl;
    }

    public String getGamePath() {
        return gamePath;
    }

    public void setGamePath(String gamePath) {
        this.gamePath = gamePath;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}