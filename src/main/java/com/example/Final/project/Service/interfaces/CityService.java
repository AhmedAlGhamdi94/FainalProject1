package com.example.Final.project.Service.interfaces;

import com.example.Final.project.entity.City;

import java.util.List;

public interface CityService {
    List<City> getAllCities ();

    City getCityById ( String id );

    City saveCity ( City city );

    void deleteCity ( String id );
}
