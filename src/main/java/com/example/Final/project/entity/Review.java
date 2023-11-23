package com.example.Final.project.entity;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Review ( String id, String comment, User user, City city ) {
        this.id = id;
        this.user = user;
        this.city = city;
    }

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Review ( String id, User user, City city ) {
        this.id = id;
        this.user = user;
        this.city = city;
    }
}
