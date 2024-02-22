package org.example.review.project.mapper;

import org.example.review.project.dto.ReviewDto;
import org.example.review.project.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ReviewMapper {
    Review toEntity(ReviewDto dto);
}
