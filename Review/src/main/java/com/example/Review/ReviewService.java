package com.example.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Reviews> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Reviews> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    public Reviews saveReview(Reviews review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
