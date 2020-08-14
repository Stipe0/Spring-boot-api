package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserWeb1ApplicationTests {
	
	@MockBean
	private UserRepository repo;
	
	@Autowired
	private UserService service;
	

	@Test
	void getByName() {
		User user= new User(1, "Peter", "Programmer");
		Mockito.when(repo.findByName("Peter")).thenReturn(user);
		assertThat(service.GetUserByName("Peter")).isEqualTo(user);				
		
		
		
	}

}
