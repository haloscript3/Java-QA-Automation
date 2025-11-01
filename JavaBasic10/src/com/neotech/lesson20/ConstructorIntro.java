package com.neotech.lesson20;

public class ConstructorIntro {

	// lets create some properties
	String name;
	int age;

	// how can we create a constructor:
	// just follow the following rules:
	// 1. Constructor method should have the class name
	// 2. Constructor method can not have a return type, not even void!
	// 3. Constructor method may or may not have arguments
	// 4. Constructor method can not be static

	// my default constructor: no arguments
	ConstructorIntro() {
		System.out.println("I am the default constructor");
	}

	public static void main(String[] args) {
		// Java will call the default constructor
		ConstructorIntro obj1 = new ConstructorIntro();

		// initial values of the object properties:
		System.out.println(obj1.name);
		System.out.println(obj1.age);

		obj1.name = "Bahar";
		obj1.age = 25;

		System.out.println(obj1.name);
		System.out.println(obj1.age);

		ConstructorIntro obj2 = new ConstructorIntro();

	}

}
