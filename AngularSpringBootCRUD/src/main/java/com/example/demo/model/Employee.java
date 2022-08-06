package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	//annotation specifies that the class is an entity and is mapped to a database table.
@Table(name = "Employees") //annotation is used for adding the table name in the particular MySQL database.
public class Employee {

	//This annotation specifies the primary key of the entity.
	@Id  
	/*This annotation is used to specify the primary key generation strategy to use. 
	 * i.e Instructs database to generate a value for this field automatically. 
	 * If the strategy is not specified by default AUTO will be used.*/
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/*this annotation is used for Adding the column the name 
	 * in the table of a particular MySQL database.*/
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
