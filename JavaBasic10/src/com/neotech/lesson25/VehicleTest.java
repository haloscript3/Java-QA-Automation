package com.neotech.lesson25;

public class VehicleTest {

	public static void main(String[] args) {

		// We cannot instantiate the Vehicle or the Car classes
//		Vehicle v1 = new Vehicle("Red");
//		Car c1 = new Car("Red", "Tesla");
		
		
		
		
		
		Vehicle v1 = new Tesla("White", "Tesla");
		
		v1.start();
		v1.drive();
		v1.brake();
		v1.stop();

		//Can v1 access the display() and carDetails()???
//		v1.display();
//		v1.carDetails();
		
		
		//If we want to access the display() for v1 we can downcast it to Tesla type 
		Tesla t1 = (Tesla) v1;
		t1.display();
		
		
		//Can I refer to v1 as a Car object??? (here v1 and t1 on runtime has the same info)
		Car c1 = (Tesla) v1;
		c1.carDetails();

		
		
		
		//---------------------------
		
		Toyota toyota1 = new Toyota("Black", "Camry"); //declaring a Toyota object and assigning to a Toyota type
		Car toyota2 = new Toyota("Red", "RAV4"); //declaring a Toyota object and assigning to a Car type
		Vehicle toyota3 = new Toyota("Blue", "Highlander"); //declaring a Toyota object and assigning to a Vehicle type
		
		toyota1.start();
		toyota2.start();
		toyota3.start();
		
		
		//keep in mind, that assigning an object to different types, changes the visibility
		Tesla tesla1 = new Tesla("Black", "S");
		Vehicle tesla2 = new Tesla("Red", "3");
		
		
		tesla1.display();
		//tesla2.display();
		
	}

}
