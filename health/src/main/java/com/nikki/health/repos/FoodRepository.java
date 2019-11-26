package com.nikki.health.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nikki.health.entities.Food;


public interface FoodRepository extends JpaRepository<Food, String> {

	
	

}
