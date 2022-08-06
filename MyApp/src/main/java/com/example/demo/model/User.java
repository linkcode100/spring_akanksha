package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	@Column(name="userName", unique = true)
//	private String userName;
//	
//	@Column(name="firstName")
//	private String firstName;
//	
//	@Column(name="lastName")
//	private String lastName;
//	
//	@Column(name="emailId", unique = true)
//	private String emailId;
//	
//	@Column(name="password", unique = true)
//	private String password;
//	
//	@Column(name="mobileNo", unique = true)
//	private String mobileNo;
//	
//	
//	public User() {
//		
//	}
//	public User(int id, String userName, String firstName, String lastName, String emailId, String password, String mobileNo) {
//		super();
//		this.id = id;
//		this.userName = userName;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.emailId = emailId;
//		this.password = password;
//		this.mobileNo = mobileNo;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getMobileNo() {
//		return mobileNo;
//	}
//	public void setMobileNo(String mobileNo) {
//		this.mobileNo = mobileNo;
//	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	public User() {
		
	}
	
	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
