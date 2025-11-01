package com.neotech.lesson14;

public class Dog {
	// Create a class Dog
	// features: breed, size, color, age
	// behaviors: eat(), run(), breed()

	String breed;
	String size;
	String color;
	int age;

	void eat() {
		System.out.println(breed + " eats!");
	}

	void run() {
		System.out.println(breed + " runs!");
	}

	void breed() {
		System.out.println(breed + " breeds!");
	}

	void getInfo() {
		System.out.println("Breed: " + breed);
		System.out.println("Color: " + color);
		System.out.println("Size: " + size);
		System.out.println("Age: " + age);
	}
}
