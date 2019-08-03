package com.uetcodecamp.food4u.food4u.repository;

import com.uetcodecamp.food4u.food4u.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
}
