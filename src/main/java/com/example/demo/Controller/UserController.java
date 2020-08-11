package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String textinbroser() {
		return "this is the text";
	}
		
	@GetMapping("/user")
	public User getUser() {
	return	service.getUser();
	}

}
