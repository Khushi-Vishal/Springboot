package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.serviceImpl.UserServiceImpl;




@Controller
public class ViewController {
	@Autowired
	private UserServiceImpl userService;

	User user = new User();

	@RequestMapping("/home")
	public String homePage() {

		return "index";
	}

	@RequestMapping("/regis")
	public String regis(@RequestParam String id, @RequestParam String name, @RequestParam String username,
			@RequestParam String password) {
		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		user.setUserName(username);

		userService.createUser(user);
		return "login";
	}

	@GetMapping("/register")
	public String UserRegister() {

		return "registration";
	}

	@RequestMapping("/login1")
	public String AuthUser(@RequestParam String userName, @RequestParam String password, Model model) {
	
		User user = userService.UserAuth(userName, password);
		if (user != null)
		{
			model.addAttribute("user",user); 
		return "home"; 
		}
	
		else return "registration";
	} 

	@RequestMapping("/login")
	public String UserLogin() {

		return "login";
	}

}
