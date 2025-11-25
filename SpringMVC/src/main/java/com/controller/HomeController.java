package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;

@Controller
public class HomeController {

//	@RequestMapping("/")
//	public String index(HttpServletRequest request) {
//		request.setAttribute("number", 3245);
//		request.setAttribute("name", "my name is here");
//		request.setAttribute("double", 345.45);
//		List list = new ArrayList();
//		list.add("java");
//		list.add(2353);
//		list.add(345767566);
//		list.add('g');
//		list.add(false);
//		request.setAttribute("list", list);
//		return "index";
//	}

	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("number", 3245);
		m.addAttribute("name", "my name is here");
		m.addAttribute("double", 345.45);
		List list = new ArrayList();
		list.add("java");
		list.add(2353);
		list.add(345767566);
		list.add('g');
		list.add(false);
		m.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

//	@RequestMapping(value="/add",method = RequestMethod.POST)
//	public String add(@RequestParam("name") String name,
//			@RequestParam("contact") long contact,
//			@RequestParam("address") String address,
//			@RequestParam("email") String email,
//			@RequestParam("password") String password
//			) {
//		System.out.println(name+contact+address+email+password);
//		return "index";
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute User u) {
		System.out.println(u);
		return "index";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
