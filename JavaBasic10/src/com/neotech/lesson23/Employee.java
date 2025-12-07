package com.neotech.lesson23;

public class Employee {

	double salary;

	void getPaid() {
		System.out.println("this employee makes " + salary);
	}
}

class Contractor extends Employee {

	double hourlyRate;

	void getPaid() {
		System.out.println("This contractor makes " + hourlyRate + " an hour");
	}
}

class FullTimeEmployee extends Employee {

}
