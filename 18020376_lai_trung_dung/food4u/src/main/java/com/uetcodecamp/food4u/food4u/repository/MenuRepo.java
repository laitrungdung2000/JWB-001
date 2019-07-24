package com.uetcodecamp.food4u.food4u.repository;

import com.uetcodecamp.food4u.food4u.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepo extends JpaRepository<Menu, Integer> {
    public List<Menu> findByRestaurantId(int id);
}
