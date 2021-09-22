package com.lti.model;

import java.time.LocalDate;

public class User {
	int userId;
	String userName;
	LocalDate dateOfBirth;
	String email;
	String phone;
	String password;

	public User() {

	}

	public User(int userId, String userName, LocalDate dateOfBirth, String email, String phone, String password) {

		this.userId = userId;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + "]";
	}

}
