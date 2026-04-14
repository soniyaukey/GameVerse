package com.gameversehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.gameversehub.model.Review;
import com.gameversehub.repository.ReviewRepository;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // 🔹 SAVE REVIEW (Add rating + comment)
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    // 🔹 GET ALL REVIEWS
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    // 🔹 GET REVIEWS BY GAME
    public List<Review> getReviewsByGame(Long gameId) {
        return reviewRepository.findByGameId(gameId);
    }

    // 🔹 GET REVIEWS BY USER
    public List<Review> getReviewsByUser(Long userId) {
        return reviewRepository.findByUserId(userId);
    }

    // 🔹 DELETE REVIEW
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}