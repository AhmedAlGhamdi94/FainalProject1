package com.example.Final.project.Controller;

import com.example.Final.project.Service.Impl.CityServiceImpl;
import com.example.Final.project.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cities")
public class

CityController {
    @Autowired
    private CityServiceImpl cityService;

    @GetMapping("/all")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{cityId}")
    public City getCityById( @PathVariable String cityId) {
        return cityService.getCityById(cityId);
    }

    @PostMapping("/addCity")
    public City saveCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @DeleteMapping("/delete/{cityId}")
    public void deleteCity(@PathVariable String cityId) {
        cityService.deleteCity(cityId);
    }


}


