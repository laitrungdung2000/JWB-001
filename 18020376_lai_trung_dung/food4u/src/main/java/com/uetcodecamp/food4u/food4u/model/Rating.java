package com.uetcodecamp.food4u.food4u.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class Rating {
    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Rating(double rating) {
        this.rating = rating;
    }
    public Rating() {}
}
