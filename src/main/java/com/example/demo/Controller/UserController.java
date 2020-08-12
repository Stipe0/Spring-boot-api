package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exceptions.IllegalIputException;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

import antlr.StringUtils;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String textinbroser() {
		return "this is the text";
	}
		
	@GetMapping("/user")
	public User getUser() throws IllegalAccessException {
		if(service.getUser().getId()==0) throw new IllegalAccessException();

	return	service.getUser();
	}
	
	@GetMapping("/numusers")
	public int numberOfUsers() {
		return service.sizeOfUsers();
	}
	
	@PostMapping("/user/{message}")
	public String postMessage(@PathVariable String message) {
		System.out.println(message);
		if(message.equals("auto")) {
			System.out.println("runnig line 41");
			throw new IllegalIputException("sirko");
		}
		return message;
	}
	
	@Value("${spring.datasource.url}")
	private String value;
	
	@GetMapping("/property")
	public String propertiMessage() {
		return value;
	}
}
