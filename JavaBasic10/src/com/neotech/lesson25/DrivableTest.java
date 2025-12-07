package com.neotech.lesson25;

public class DrivableTest {

	public static void main(String[] args) {

		// We cannot instantiate an interface!!! There is no implementation on it!!!
	
		//Drivable d1 = new Drivable();
	
		
		Drivable d2 = new Cars(); //up-casting 
		
		d2.drive();
		//d2.stop(); //not accessible from Drivable type object (we need to have Vehicles or Cars object type)
		
		System.out.println(Drivable.DRIVE_FAST);
		
	
		
		Vehicles v1 = new Cars(); 
		v1.start();
		v1.stop();
	//	v1.drive();  //it does not exist in Vehicles 
		
		
		
		//How do I access everything???
		
		Cars c1 = new Cars();
		c1.start();
		c1.drive();
		c1.stop();
		
		
		
	}

}
