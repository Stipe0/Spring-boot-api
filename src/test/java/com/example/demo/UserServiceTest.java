package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService service;

	@Test
	public void size() {
		int size = service.sizeOfUsers();
		assertThat(size).isNotNull();
		assertThat(size).isEqualTo(0);
	}
	@Test
	public void size2() {
		int size = service.sizeOfUsers();
		assertThat(size).isNotNull();
		
	}
	@Test
	public void newUser() {
		User user= new User(1, "Peter", "Programmer");
		assertThat(service.makeNewUser(1, "Peter", "Programmer")).isEqualTo(user);
		
		
	}
	@Test
	public void newUser2() {
		User user= new User(1, "", "Programmer");
		assertThat(service.makeNewUser(user)).isEqualTo(user);
		
	}
		
}
