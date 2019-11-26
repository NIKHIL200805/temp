package com.nikki.health.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nikki.health.entities.User;
import com.nikki.health.repos.UserRepository;

public class UserServiceimpl implements UserService {
@Autowired
private UserRepository repo;
	public UserRepository getRepo() {
	return repo;
}

public void setRepo(UserRepository repo) {
	this.repo = repo;
}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public void deleteUser(User user) {
		repo.delete(user);

	}

	@Override
	public Object getUserById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
