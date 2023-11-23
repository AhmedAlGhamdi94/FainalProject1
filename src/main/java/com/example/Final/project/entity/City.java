package com.example.Final.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    public City () {

    }

    public void setName ( String name ) {
        this.name = name;
    }

    public void setClimate ( String climate ) {
        this.climate = climate;
    }

    public void setPopulation ( String population ) {
        this.population = population;
    }

    public City ( String id, String name, String climate, String population ) {
        this.id = id;
        this.name = name;
        this.climate = climate;
        this.population = population;
    }

    private String name;
    private String climate;
    private String population;


    public void setId ( String cityId ) {
    }
}

