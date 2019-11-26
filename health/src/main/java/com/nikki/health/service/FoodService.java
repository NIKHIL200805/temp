package com.nikki.health.service;

import java.util.List;

import com.nikki.health.entities.Food;



public interface FoodService {
	Food saveFood(Food food);
Food updateFood(Food food);
void deleteFood(Food food);
Object getFoodById(String id);
List<Food> getAllFoods();

}
