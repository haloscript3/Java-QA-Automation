package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {

		// using the default constructor
		Student st1 = new Student();
		st1.displayInfo();

		st1.name = "Brenda";
		st1.address = "New York";

		st1.displayInfo();

		System.out.println("--------------");

		// using the second constructor
		Student st2 = new Student("Burak");
		st2.displayInfo();
		st2.address = "Chicago";

		st2.displayInfo();

		System.out.println("--------------");

		// using the third constructor
		Student st3 = new Student("Ozzy", "Cincinnati");
		st3.displayInfo();

	}

}
