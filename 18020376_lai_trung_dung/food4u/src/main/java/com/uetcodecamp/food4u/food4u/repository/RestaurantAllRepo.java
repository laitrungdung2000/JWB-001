package com.uetcodecamp.food4u.food4u.repository;

import com.uetcodecamp.food4u.food4u.model.RestaurantAll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantAllRepo extends JpaRepository<RestaurantAll, Integer> {
}
