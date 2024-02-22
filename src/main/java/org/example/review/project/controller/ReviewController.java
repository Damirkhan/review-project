package org.example.review.project.controller;

import lombok.RequiredArgsConstructor;
import org.example.review.project.dto.ReviewDto;
import org.example.review.project.entity.Review;
import org.example.review.project.exception.ResourceNotFoundException;
import org.example.review.project.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public void addReview(@RequestBody ReviewDto review) {
        reviewService.saveReview(review);
    }

    @PutMapping("/{id}")
    public void editReview(@PathVariable Long id, @RequestBody ReviewDto updatedReview) throws ResourceNotFoundException {
        reviewService.updateReview(id, updatedReview);
    }

    @GetMapping("/user/{userId}")
    public List<Review> getUserReviews(@PathVariable Long userId) {
        return reviewService.getUserReviews(userId);
    }

}
