package com.neotech.lesson22;

public class CarTest {

	public static void main(String[] args) {

		//this calls the default constructor
		Car c1 = new Car();
		
		Car c2 = new Car("Honda", "Accord", 2020);
		
		
		SportsCar s1 = new SportsCar();
		SportsCar s2 = new SportsCar("BMW", "M5", 2020, "Manual", 260);
		
		FamilyCar f1 = new FamilyCar();
		
		LuxurySportsCar l1 = new LuxurySportsCar();
	}

}
