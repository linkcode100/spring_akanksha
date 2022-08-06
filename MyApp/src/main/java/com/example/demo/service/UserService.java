package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
	
	// creating user
	public User saveUser(User user);
	
	public User fetchUserByEmailId(String email);
	
	public User fetchUserByEmailIdAnPassword(String email, String password);
}
