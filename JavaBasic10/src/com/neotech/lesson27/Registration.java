package com.neotech.lesson27;

public class Registration {
	/*
	Create Registration Class in which you would have
	variables as email, userName and password that
	have an access scope only within its own class.
	After creating an object of the class user should be
	able to call methods and in each method separately
	pass values to set users email, username and
	password.
	
	Requirements:
	Valid email consider to be only yahoo!
	Valid userName and password cannot be empty and should be of length larger than 6 characters.
	Also valid password cannot contain userName.
	 */

	private String email, username, password;

	// Getters
	public String getEmail() {
		return this.email;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	// Setters
	public void setEmail(String email) {
		if (email.contains("yahoo.com")) {
			this.email = email;
		} else {
			System.out.println("Only yahoo emails are accepted!!!");
		}
	}

	// setUsername: 2 requirements
	// Can not be blank
	// Should be at least 6 chars
	public void setUsername(String username) {
		if (username.isEmpty() || username.length() < 6) {
			System.out.println("Username should be at least 6 chars!!!");
		} else {
			this.username = username;
		}
	}

	// setPassword: 3 requirements
	// Can not be blank
	// Should be at least 6 chars
	// Can not contain username
	public void setPassword(String password) {
		if (!password.isEmpty() && password.length() >= 6 && !password.contains(this.username)) {
			this.password = password;
		} else {
			System.out.println("Password can not be less than 6 chars and contain the username!!!");
		}

		// task: use nested ifs to accomplish the same result
	}
}
