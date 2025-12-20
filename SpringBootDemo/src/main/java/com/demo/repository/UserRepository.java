package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User;

public interface UserRepository extends JpaRepository<User,  Integer>{

	User findByName(String name);
	
	User findByEmailAndPassword(String email,String password);
}
