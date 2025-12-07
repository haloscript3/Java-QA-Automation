package com.neotech.review08_final;

public final class Student extends Person {
	String major;

	public Student(String name, String id, String major) {
		super(name, id);
		this.major = major;
	}

	public void displayInfo() {
		System.out.println("ID: " + id + " Name: " + name + " Major: " + major);
	}
	
	// Attempting to override a final method
	// This causes an error
//	public void sayHello() {
//		System.out.println("Trying to change!!!");
//	}

}

// Attempting to extend a final class
//This causes an error

//class MedicalStudent extends Student{
//	
//}
