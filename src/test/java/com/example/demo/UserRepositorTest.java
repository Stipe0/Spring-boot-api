package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@RunWith(SpringRunner.class)

@DataJpaTest
class UserRepositorTest {

	@Autowired
	private TestEntityManager entityMenager;

	@Autowired
	private UserRepository repo;

	@Test
	void findByNameTest() {
		User user = new User(1, "Peter", "Programmer");
		entityMenager.persist(user);
		entityMenager.flush();

		User foundUser = repo.findByName("Peter");
		assertThat(foundUser).isEqualTo(user);

	}

}
