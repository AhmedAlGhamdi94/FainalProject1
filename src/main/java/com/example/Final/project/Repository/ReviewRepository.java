package com.example.Final.project.Repository;

import com.example.Final.project.entity.City;
import com.example.Final.project.entity.Review;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {
    List<Review> findByCity( City city);
    List<Review> findByUser( User user);
}

