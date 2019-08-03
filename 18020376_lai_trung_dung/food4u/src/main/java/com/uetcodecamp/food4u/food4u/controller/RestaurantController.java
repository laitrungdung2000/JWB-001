package com.uetcodecamp.food4u.food4u.controller;

import com.uetcodecamp.food4u.food4u.model.Menu;
import com.uetcodecamp.food4u.food4u.model.Rating;
import com.uetcodecamp.food4u.food4u.model.Restaurant;
import com.uetcodecamp.food4u.food4u.model.RestaurantAll;
import com.uetcodecamp.food4u.food4u.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @RequestMapping("")
    public List<RestaurantAll> index() {
        return restaurantService.getAllRestaurant();
    }

    @GetMapping("/{id}")
    public Restaurant indexRestaurant(@PathVariable("id") int id) {
        return restaurantService.getRestaurantById(id);
    }

    @PostMapping("")
    public Restaurant indexAddRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addNewRestaurantById(restaurant);
    }

    @PutMapping("/{id}/rating")
    public Restaurant indexSetRating(@PathVariable("id") int id,
                                     @RequestBody Rating rating) {
        return restaurantService.setRatingRestaurantById(rating, id);
    }

    @GetMapping("/{id}/menu")
    public List<Menu> indexMenu(@PathVariable("id") int id) {
        return restaurantService.getMenuById(id);
    }
}
