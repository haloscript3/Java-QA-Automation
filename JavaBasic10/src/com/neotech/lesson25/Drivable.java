package com.neotech.lesson25;

public interface Drivable {

	
	//Java will automatically add this in front of my variables in the interface: public static final
	boolean DRIVE_FAST = true; //same as public static final boolean DRIVE_FAST = true;
	
	
	//All the methods in the interface will be public abstract by default!!!!
	void drive();  //same as public abstract void drive();
}


abstract class Vehicles
{
	void start()
	{
		System.out.println("Vehicles can start!");
	}
	
	abstract void stop();
	
}


//multiple inheritance -- Cars will inherit from Vehicles and Drivable

/* 
 		class --- extends  --- class
 		class --- implements --- interface 
 		interface --- extends --- interface 
 * 
 * 
 */

class Cars extends Vehicles implements Drivable
{

	@Override
	public void drive() {
		System.out.println("Cars can drive!");
	}

	@Override
	void stop() {
		System.out.println("Cars can stop!");
	}
	
}




