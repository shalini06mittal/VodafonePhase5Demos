package com.boot.db.SpringWebDemo.entity;

public class LoginUser {

	private String email;
	private String password;
	
	public LoginUser() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginUser [email=" + email + ", password=" + password + "]";
	}
	
}
