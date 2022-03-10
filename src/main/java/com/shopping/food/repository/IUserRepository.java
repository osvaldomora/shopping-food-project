package com.shopping.food.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.food.model.User;

public interface IUserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByNameAndPassword(String name, String pass);

}
