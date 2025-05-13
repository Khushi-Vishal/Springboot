package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.example.demo.entity.User;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceImpl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService; 

	@PostMapping("/register")
	public ResponseEntity<User> createUser(@ModelAttribute User user) 
	{
		System.out.println("Inside controller: " + user.getUserName()); 
		user = userService.createUser(user);
		return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
	
	}

	@GetMapping("/all")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable String id,@RequestBody User user)
	{
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable String id)
	{
		return userService.deleteUser(id);

	}
}
