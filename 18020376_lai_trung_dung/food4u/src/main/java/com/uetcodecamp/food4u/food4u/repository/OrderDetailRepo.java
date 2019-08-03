package com.uetcodecamp.food4u.food4u.repository;

import com.uetcodecamp.food4u.food4u.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetail, Integer> {
}
