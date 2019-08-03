package com.uetcodecamp.food4u.food4u.service;

import com.uetcodecamp.food4u.food4u.model.Order;
import com.uetcodecamp.food4u.food4u.model.OrderGet;
import com.uetcodecamp.food4u.food4u.model.Restaurant;
import com.uetcodecamp.food4u.food4u.repository.OrderRepo;
import com.uetcodecamp.food4u.food4u.repository.RestaurantAllRepo;
import com.uetcodecamp.food4u.food4u.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<OrderGet> getAllOrder() {
        List<Order> orderList = orderRepo.findAll();
        List<OrderGet> orderGetList = new ArrayList<OrderGet>();
        for(Order temp: orderList) {
            Restaurant restaurant = restaurantRepo.getOne(temp.getRestaurant_id());
            orderGetList.add(new OrderGet(temp.getOrderId(),restaurant.getName(), temp.getAmount(),temp.getStatus()));
        }
        return orderGetList;
    }
}
