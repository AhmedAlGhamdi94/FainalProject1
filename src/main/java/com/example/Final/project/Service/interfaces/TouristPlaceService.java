package com.example.Final.project.Service.interfaces;

import com.example.Final.project.entity.TouristPlace;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TouristPlaceService {
    List<TouristPlace> getTouristPlacesByCity( String cityId);
    TouristPlace saveTouristPlace(TouristPlace touristPlace);

}

