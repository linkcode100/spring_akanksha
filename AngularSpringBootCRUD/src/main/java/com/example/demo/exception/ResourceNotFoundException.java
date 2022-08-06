package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus marks a method or exception class with the status code and 
//reason message that should be returned.
@ResponseStatus(value = HttpStatus.NOT_FOUND) 
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
	
}
