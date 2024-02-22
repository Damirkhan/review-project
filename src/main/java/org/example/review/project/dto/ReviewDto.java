package org.example.review.project.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ReviewDto {
    private Long userId;
    private Long productId;
    private String text;
}
