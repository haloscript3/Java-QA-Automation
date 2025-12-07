package com.neotech.lesson23;

public class Animal {

	public void eat() {
		System.out.println("All animals eat");
	}

	public void sleep() {
		System.out.println("All animals sleep");
	}
}

class Tiger extends Animal {

	public void run() {
		System.out.println("All tigers run");
	}

	// overriding the eat() method
	public void eat() {
		System.out.println("Tigers eat meat!");
	}
}

class Dog extends Animal {

	public void bark() {
		System.out.println("All dogs bark");
	}
}
