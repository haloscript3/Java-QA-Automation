package com.neotech.lesson23;

/*
Write program: UserClass that has a constructor that
initializes instance variables name and mobile number.
Create a subclass UserInfo that will have user address
variable and it is also being initialized through constructor
call. Print users name, mobile number and address in
userDetails method. Test your code.
*/
public class UserClass {

	String name;
	long mobileNumber;

	public UserClass(String name, long mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
}

class UserInfo extends UserClass {

	String address;

	public UserInfo(String name, long mobileNumber, String address) {
		super(name, mobileNumber);

		this.address = address;
	}

	public void printDetails() {
		System.out.println("Users details:");
		System.out.println("Name: " + this.name);
		System.out.println("Phone: " + this.mobileNumber);
		System.out.println("Address: " + this.address);
	}
}
