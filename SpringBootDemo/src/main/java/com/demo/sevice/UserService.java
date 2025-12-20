package com.demo.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.User;
import com.demo.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> getAllU() {
		return this.repo.findAll();
	}

	public Optional<User> getUserById(int id) {
		return this.repo.findById(id);
	}

	public User addUser(User u) {
		return this.repo.save(u);
	}
	
	
	public User updaeUser(User u) {
		return this.repo.save(u);
	}

	public User getUserByName(String name) {
		return this.repo.findByName(name);
	}

	public User getUserByEmailNPass(String email, String password) {
		return this.repo.findByEmailAndPassword(email, password);
	}
	
	

}
