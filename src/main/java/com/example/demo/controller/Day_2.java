package com.example.demo.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day_2 {
	@GetMapping("/user_name")
	public String getName()
	{
		return "Khushi Singh";
	}
	
	@GetMapping("users")
	public String getIds(@RequestParam(required=false) String id)
	{
		List<String> al=new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("8");
		al.add("9");
		al.add("10");
		
		if(id!=null)
		{
		for(String s: al)
		{
			if(s.equals(id))return s;
		}
		return "";
	}
		return al.toString();
		
	}	
}
