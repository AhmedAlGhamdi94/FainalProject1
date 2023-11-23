package com.example.Final.project.Service.interfaces;

import com.example.Final.project.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ReviewService {
    List<Review> getReviewsByCity( String cityId);
    List<Review> getReviewsByUser( String userId);
    Review saveReview(Review review);

}

