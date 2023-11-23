package com.example.Final.project.Service.Impl;

import com.example.Final.project.Repository.ReviewRepository;
import com.example.Final.project.Service.interfaces.ReviewService;
import com.example.Final.project.entity.Review;
import com.example.Final.project.entity.City;
import com.example.Final.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getReviewsByCity(String cityId) {
        City city = new City();
        city.setId(cityId);
        return reviewRepository.findByCity(city);
    }

    @Override
    public List<Review> getReviewsByUser(String userId) {
        User user = new User();

        return reviewRepository.findByUser((org.apache.catalina.User) user);
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }
}
