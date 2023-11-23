package com.example.Final.project.Repository;

import com.example.Final.project.entity.City;
import com.example.Final.project.entity.TouristPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TouristPlaceRepository extends JpaRepository<TouristPlace, String> {
    List<TouristPlace> findByCity( City city);
}

