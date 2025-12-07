package com.neotech.lesson25;

public abstract class Vehicle {
	
	String color;
	
	Vehicle(String color)
	{
		this.color = color;
	}
	
	public void drive()
	{
		System.out.println("Vehicle drives!");
	}
	
	
	public void stop()
	{
		System.out.println("Vehicle stops!");
	}
	
	public abstract void start();
	public abstract void brake();
	
}




abstract class Car extends Vehicle
{
	String carType;

	Car(String color, String carType) {
		super(color);
		this.carType = carType;
	}
	
	//Can I implement any or both of the abstract methods in this class? 
	// YES, but I am not required to since this class is abstract too
	
	
	public void brake()
	{
		System.out.println(carType + " have brakes!");
	}
	
	//this class is abstract, so I could add other abstract methods too
	
	public abstract void carDetails();
	
}


class Tesla extends Car
{
	Tesla(String color, String carType) {
		super(color, carType);
	}
	
	
	@Override
	public void carDetails() {
		System.out.println("Tesla details: " + carType + " " + color);
	}

	@Override
	public void start() {
		System.out.println("Tesla has remote start!");
	}
	
	//can I add specific behaviors for this class?? YES
	public void display()
	{
		System.out.println("We have a " + color + " "+ carType );
	}
	
}

class Toyota extends Car
{

	Toyota(String color, String carType) {
		super(color, carType);
	}

	@Override
	public void carDetails() {
		System.out.println("Toyota details: " + carType + " " + color);
		
	}

	@Override
	public void start() {
		System.out.println("Toyota has a keyless start!");
	}
	
}
