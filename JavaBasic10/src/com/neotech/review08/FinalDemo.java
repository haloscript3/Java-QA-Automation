package com.neotech.review08_final;

public class FinalDemo {

	public static void main(String[] args) {

		Person p1 = new Person("Alisan", "007");

		p1.displayInfo();
		p1.sayHello();

		// Compile-time error: Final variable cannot be re-assigned
		// p1.id = "999";

	}

}
