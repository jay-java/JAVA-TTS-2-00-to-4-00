package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.sevice.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService service;

	@GetMapping("/")
	public String index() {
		return "index page msg";
	}

	@GetMapping("/home")
	public String homeData() {
		return "home page data";
	}

	@GetMapping("/user")
	public String data() {
		return "this method return us data";
	}

	@GetMapping("/allusers")
	public List<User> getAllUsers() {
		return this.service.getAllU();
	}

	@PostMapping("/")
	public User addUser(@RequestBody User u) {
		return this.service.addUser(u);
	}

	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable("id") int id) {
		System.out.println(id);
		return this.service.getUserById(id);
	}
}
