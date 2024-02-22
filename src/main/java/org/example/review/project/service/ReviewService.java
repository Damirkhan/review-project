package org.example.review.project.service;

import lombok.RequiredArgsConstructor;
import org.example.review.project.dto.ReviewDto;
import org.example.review.project.entity.Review;
import org.example.review.project.exception.ResourceNotFoundException;
import org.example.review.project.mapper.ReviewMapper;
import org.example.review.project.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;

    public void saveReview(ReviewDto reviewDto) {
        Review review = reviewMapper.toEntity(reviewDto);
        reviewRepository.saveAndFlush(review);
    }

    public void updateReview(Long id, ReviewDto updatedReview) throws ResourceNotFoundException {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Review not found with id: " + id));
        review.setText(updatedReview.getText());
        reviewRepository.saveAndFlush(review);
    }

    public List<Review> getUserReviews(Long userId) {
        return reviewRepository.findReviewsByUserId(userId);
    }
}
