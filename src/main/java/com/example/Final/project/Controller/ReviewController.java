package com.example.Final.project.Controller;
import com.example.Final.project.entity.Review;
import com.example.Final.project.Service.interfaces.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/byCity/{cityId}")
    public List<Review> getReviewsByCity(@PathVariable String cityId) {
        return reviewService.getReviewsByCity(cityId);
    }

    @GetMapping("/byUser/{userId}")
    public List<Review> getReviewsByUser(@PathVariable String userId) {
        return reviewService.getReviewsByUser(userId);
    }

    @PostMapping("/save")
    public Review saveReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }
}
