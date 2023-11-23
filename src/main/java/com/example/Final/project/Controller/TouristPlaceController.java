package com.example.Final.project.Controller;
import com.example.Final.project.Service.interfaces.TouristPlaceService;
import com.example.Final.project.entity.TouristPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tourist-places")
public class TouristPlaceController {

    private final TouristPlaceService touristPlaceService;

    @Autowired
    public TouristPlaceController(TouristPlaceService touristPlaceService) {
        this.touristPlaceService = touristPlaceService;
    }

    @GetMapping("/byCity/{cityId}")
    public List<TouristPlace> getTouristPlacesByCity(@PathVariable String cityId) {
        return touristPlaceService.getTouristPlacesByCity(cityId);
    }

    @PostMapping("/save")
    public TouristPlace saveTouristPlace(@RequestBody TouristPlace touristPlace) {
        return touristPlaceService.saveTouristPlace(touristPlace);
    }
}
