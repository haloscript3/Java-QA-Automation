package com.neotech.lesson22;

public class Car {

   /*
	Write a Java program called Car. Specify features and behaviors of the Car class.
    Create SportsCar and FamilyCar subclasses of the Car class with their own features 
    and behaviors.
    Next, create a LuxurySportsCar that will inherit the SportsCar and also will have 
    its own features and behaviors.
    Create objects from each class and test them.
										Car
								|					|
							SportsCar			FamilyCar
								|
							LuxurySportsCar
	*
	*/
	
	
	String make, model; 
	int year;
	
	
	public Car() {
		System.out.println("This is my default constructor!!!");
	}


	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
}


class SportsCar extends Car 
{
	String transmission;
	int speed;
	
	// it is totally up to me (and the requirements) what logic is implemented here!!!
	public SportsCar()
	{
		//if I leave this empty, then the instance variables will get default values
		//I can avoid the default values (null, 0 etc..)
		
		//How? Because I can control what happens here..
		this("NoMake", "NoModel", -1, "NotProvided", -1);
	}

	public SportsCar(String make, String model, int year, String transmission, int speed) {
		//super(make, model, year);
        this.make = make;
        this.model = model;
        this.year = year;
		this.transmission = transmission;
		this.speed = speed;
	}
	
	
	
}

class FamilyCar extends Car 
{
	boolean childLock; 
	int seats; 
	
	FamilyCar()
	{
		//if I leave it like this, the variables will have default values
		System.out.println("This is a FamilyCar default constructor!");
	}

	//FamilyCar(String, String, int, boolean, int)
	public FamilyCar(String make, String model, int year, boolean childLock, int seats) {
		//this is calling a constructor in the parent class that takes as
		//parameters (String, String, int)
		super(make, model, year);
		this.childLock = childLock;
		this.seats = seats;
	}
}

class LuxurySportsCar extends SportsCar
{
	boolean designerSeats;
}

