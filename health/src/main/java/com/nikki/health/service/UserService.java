package com.nikki.health.service;

import java.util.List;

import com.nikki.health.entities.User;

public interface UserService {
	User saveUser(User user);
User updateUser(User user);
void deleteUser(User user);
Object getUserById(String id);
List<User> getAllUsers();
	 
	
	
	
}
