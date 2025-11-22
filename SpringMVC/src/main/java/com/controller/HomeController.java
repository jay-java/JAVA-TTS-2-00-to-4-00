package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
