package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// home page
	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
	
	/*
	 * @RequestBody: It is used to bind HTTP request with an object in a method parameter. 
	 * Internally it uses HTTP MessageConverters to convert the body of the request. 
	 * When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP 
	 * request body to that parameter.
	 */

	@PostMapping("/signUpForm")
	public User registerUser(@RequestBody User user) throws Exception {

		String tempEmailId = user.getUserName();

		if(tempEmailId != null && !"".equals(tempEmailId)) {
			User userObj = userService.fetchUserByEmailId(tempEmailId);

			if(userObj != null) {
				throw new Exception("User with "+tempEmailId+"is already exist");
			}
		}

		User userObj = null;
		userObj = userService.saveUser(user);
		return userObj;

	}

	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getUserName();
		String tempPassword = user.getPassword();
		User userObj = null;
		
		if(tempEmailId != null && tempPassword != null) {
			userObj = userService.fetchUserByEmailIdAnPassword(tempEmailId, tempPassword);
		}
		
		if(userObj == null) {
			throw new Exception("bad credetials");
		}
		
		return userObj;
	}

}
