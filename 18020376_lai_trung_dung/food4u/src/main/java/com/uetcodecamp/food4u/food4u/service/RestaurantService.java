package com.uetcodecamp.food4u.food4u.service;

import com.uetcodecamp.food4u.food4u.model.Menu;
import com.uetcodecamp.food4u.food4u.model.Rating;
import com.uetcodecamp.food4u.food4u.model.Restaurant;
import com.uetcodecamp.food4u.food4u.repository.MenuRepo;
import com.uetcodecamp.food4u.food4u.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;
    @Autowired
    MenuRepo menuRepo;

    public List<Restaurant> getAllRestaurant() {
        return restaurantRepo.findAll();
    }

    public Restaurant getRestaurantById(int id) {
        return restaurantRepo.getOne(id);
    }

    public Restaurant addNewRestaurantById(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    public Restaurant setRatingRestaurantById(Rating rating, int id) {
        Restaurant restaurant = restaurantRepo.getOne(id);
        restaurant.setRating(rating.getRating());
         return restaurantRepo.save(restaurant);
    }
    public List<Menu> getMenuById(int id) {

        return menuRepo.findByRestaurantId(id);
    }
}
