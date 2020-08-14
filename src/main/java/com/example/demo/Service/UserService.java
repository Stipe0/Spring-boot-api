package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exceptions.NoUserFound;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public Optional<User> getUserByid(int id) {
		return repo.findById(id);
	}
	
	public User GetUserByName(String name) {
		User tmp = repo.findByName(name);
		return tmp;
	}

	public int sizeOfUsers() {
		int a = (int) repo.count();
		return a;
	}

	public User makeNewUser(int id, String name, String job) {
		User a = new User();
		a.setId(id);
		a.setJob(job);
		a.setName(name);
		repo.save(a);
		return a;
	}

	public User makeNewUser(User user) {
		User a = new User();
		a.setId(user.getId());
		a.setJob(user.getJob());
		a.setName(user.getName());
		repo.save(a);
		return a;
	}

	public List<User> getAllUsers() {
		return repo.findAll();
	}
	
	public void delete(User user) {
		repo.delete(user);
	}
	
	public User update(User newUser, User update) {
		newUser.setId(update.getId());
		newUser.setJob(update.getJob());
		newUser.setName(update.getName());
		repo.save(newUser);
		return newUser;
		
	}

}
