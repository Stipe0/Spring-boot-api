package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public User getUser() {
		User a= new User();
		repo.save(a);
		return a;
	}

}
