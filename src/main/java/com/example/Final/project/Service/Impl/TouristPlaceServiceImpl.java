package com.example.Final.project.Service.Impl;
import com.example.Final.project.Repository.TouristPlaceRepository;
import com.example.Final.project.Service.interfaces.TouristPlaceService;
import com.example.Final.project.entity.TouristPlace;
import com.example.Final.project.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristPlaceServiceImpl implements TouristPlaceService {
    @Autowired
    private TouristPlaceRepository touristPlaceRepository;

    @Override
    public List<TouristPlace> getTouristPlacesByCity(String cityId) {
        City city = new City();
        city.setId(cityId);
        return touristPlaceRepository.findByCity(city);
    }

    @Override
    public TouristPlace saveTouristPlace(TouristPlace touristPlace) {
        return touristPlaceRepository.save(touristPlace);
    }
}
