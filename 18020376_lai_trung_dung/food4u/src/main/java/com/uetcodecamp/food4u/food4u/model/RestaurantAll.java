package com.uetcodecamp.food4u.food4u.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurants")
public class RestaurantAll {
    @Id
    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "name")
    private String name;

    @Column(name = "summary")
    private String summary;

    @Column(name = "image")
    private String image;

    @Column(name = "address")
    private String address;

    @Column(name = "rating")
    private double rating;

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public RestaurantAll(int restaurantId, String name, String summary, String image, String address, double rating) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.summary = summary;
        this.image = image;
        this.address = address;
        this.rating = rating;
    }

    public RestaurantAll() {}
}
