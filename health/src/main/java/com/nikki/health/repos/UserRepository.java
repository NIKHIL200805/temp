package com.nikki.health.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikki.health.entities.User;

public interface UserRepository extends JpaRepository<User, String> {



	Optional<User> findById(String id);

}
