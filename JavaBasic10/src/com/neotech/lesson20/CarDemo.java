package com.neotech.lesson20;

public class CarDemo {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.make = "Toyota";
		c1.model = "Corolla";
		c1.year = 2020;

		c1.printDetails();

		Car c2 = new Car("Honda", "Civic", 2021);

		c2.printDetails();

		// compile time error since there is not matching constructor
		// Car c3 = new Car("Audi","A5");

	}

}
