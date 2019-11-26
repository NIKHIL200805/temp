package com.nikki.health.service;

import java.util.List;
import java.util.Optional;

import com.nikki.health.entities.Food;
import com.nikki.health.repos.FoodRepository;

public class FoodServiceimpl implements FoodService {
private FoodRepository repo1;
	public FoodRepository getRepo1() {
	return repo1;
}

public void setRepo1(FoodRepository repo1) {
	this.repo1 = repo1;
}

	@Override
	public Food saveFood(Food food) {
		// TODO Auto-generated method stub
		return repo1.save(food);
	}

	@Override
	public Food updateFood(Food food) {
		// TODO Auto-generated method stub
		return repo1.save(food);
	}

	@Override
	public void deleteFood(Food food) {
		// TODO Auto-generated method stub
      repo1.delete(food);
	}

	@Override
	public Object getFoodById(String id) {
		// TODO Auto-generated method stub
		return repo1.findById(id);
	}

	@Override
	public List<Food> getAllFoods() {
		// TODO Auto-generated method stub
		return repo1.findAll();
	}

}
