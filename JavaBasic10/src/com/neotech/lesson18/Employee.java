package com.neotech.lesson18;

public class Employee {
	// ▪ Create a Class called Employee:
	// ▪ Create three variables: eID, salary and set the CEO to “Elion”
	// ▪ CEO should be a static variable
	// ▪ Create a method printInfo() that prints out the eID, salary and
	// CEO of the object
	// ▪ Create two objects of the class Employee
	// ▪ Set the value of eID, salary for each of the objects
	// ▪ Call the printInfo() method for both objects
	// ▪ Change the CEO to “Ahmet”
	// ▪ Call the printInfo() method for both objects

	int eId;
	int salary;

	static String ceo = "Elion";

	void printInfo() {
		System.out.println("eId:" + eId + " salary:" + salary + " ceo:" + ceo);
	}

	public static void main(String[] args) {

		Employee brenda = new Employee();
		brenda.eId = 1;
		brenda.salary = 115000;
		brenda.printInfo();

		Employee maya = new Employee();
		maya.printInfo();
		maya.eId = 2;

		System.out.println("New CEO is Ahmet");

		Employee.ceo = "Ahmet";
		brenda.printInfo();
		maya.printInfo();

	}

}
