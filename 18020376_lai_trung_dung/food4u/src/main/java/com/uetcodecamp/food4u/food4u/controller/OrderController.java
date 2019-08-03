package com.uetcodecamp.food4u.food4u.controller;

import com.uetcodecamp.food4u.food4u.model.Order;
import com.uetcodecamp.food4u.food4u.model.OrderGet;
import com.uetcodecamp.food4u.food4u.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("")
    public List<OrderGet> index() {
        return orderService.getAllOrder();
    }

}
