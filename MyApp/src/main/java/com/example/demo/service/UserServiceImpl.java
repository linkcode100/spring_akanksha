package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service //It is also used at class level. It tells the Spring that class contains the business logic.
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);	
	}

	@Override
	public User fetchUserByEmailId(String email) {
		return userRepository.findByEmailId(email);
	}

	@Override
	public User fetchUserByEmailIdAnPassword(String email, String password) {
		return userRepository.findByEmailIdAndPassword(email, password);
	}

}
