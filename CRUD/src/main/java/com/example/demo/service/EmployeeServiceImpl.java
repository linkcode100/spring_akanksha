package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
//The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.
@RestController
//It is used to map web requests onto specific handler classes and/or handler methods.
@RequestMapping("/api/v1")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired //used to enable us to inject the dependency object implicitly; 
	//it is used in setter or in constructor injection internally.
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {		
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: "+ id);
		}
		
		return employee;
	}

	@Override
	public void deleteEmployee(long id) {
		this.employeeRepository.deleteById(id);
	}
	
	
}
