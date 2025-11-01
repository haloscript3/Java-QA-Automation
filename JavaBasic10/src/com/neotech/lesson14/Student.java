package com.neotech.lesson14;

public class Student {

	// Features:
	// fistName, lastName, age, gender, school, grade

	String firstName;
	String lastName;
	int age;
	char gender;
	String school;
	int grade;

	// Behaviors:
	// attendClass(), study(), doHomework()

	void attendClass() {
		System.out.println(firstName + " " + lastName + " attends all classes");
	}

	void study() {
		System.out.println(firstName + " " + lastName + " studies every night");
	}

	void doHomework() {
		System.out.println(firstName + " " + lastName + " is doing hw");
	}
}
