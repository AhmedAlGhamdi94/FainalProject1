package com.example.Final.project.entity;

import jakarta.persistence.*;



@Entity

public class TouristPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    public TouristPlace ( String id, String name, String description, City city ) {
        this.id = id;
        this.city = city;
    }

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
