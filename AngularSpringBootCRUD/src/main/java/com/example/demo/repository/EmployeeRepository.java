package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository //@Repository is a Spring annotation that indicates that the decorated class is a repository.
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	
}
