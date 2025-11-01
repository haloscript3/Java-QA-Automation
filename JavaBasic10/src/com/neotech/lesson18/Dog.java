package com.neotech.lesson18;

public class Dog {
	// instance variables: belong to instances
	String name;
	int age;

	// static variables: belong to Dog class
	static String breed = "Husky";
	static int paws = 4;

	void displayInfo() {
		System.out.println(name + " " + age + " " + breed + " " + paws);
	}
}
