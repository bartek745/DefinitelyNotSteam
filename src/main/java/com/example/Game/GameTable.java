package com.example.Game;

import java.util.ArrayList;

public class GameTable {
    private Long id;
    private String name;
    private boolean availability;
    private float price;
    private int rating;
    private List<Review> reviews;
    protected GameTable(){this.reviews=new ArrayList<>();
    }


    public GameTable(Long id, String name, boolean availability, float price, int rating) {
        this.id = id;
        this.name = name;
        this.availability = availability;
        this.price = price;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public GameTable setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GameTable setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isAvailability() {
        return availability;
    }

    public GameTable setAvailability(boolean availability) {
        this.availability = availability;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public GameTable setPrice(float price) {
        this.price = price;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public GameTable setRating(int rating) {
        this.rating = rating;
        return this;
    }
}
