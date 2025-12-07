package com.neotech.lesson21;

/* Write program as a Student class that has instance variables name and address. 
 * Create a constructor that will initialize those variables. 
 * Print name & address of given student using displayInfo method.
 */
public class Student {

	String name, address;

	// About constructor methods:
	// Should have the same name as class
	// Can not have a return type
	// It can not be static
	// We may pass parameters

	// default constructor
	Student() {

	}

	// second constructor
	Student(String name) {
		this.name = name;
	}

	// third constructor
	Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void displayInfo() {
		// this keyword is not required but is a good practice
		// it tells us we are referring to the instance variable
		System.out.println("Name: " + this.name + " Address: " + this.address);
	}
}
