package com.neotech.review07;

public class Animal {
	String name;
	int legs;
	
	//this class has only a parametrized constructor, so a default constructor cannot be used to create an object. 
	Animal(String name, int legs)
	{
		this.name = name; 
		this.legs = legs;
	}
	
	public void sleep()
	{
		System.out.println("All animals sleep!");
	}
	
	public void displayInfo()
	{
	System.out.println(name + " has " + legs + " legs!");	
	}
	
	//Create 3 classes inheriting Animal class: Wolf, Bear, Fox.
	//Wolf has no other extra features and behaviors
	//Bear has a roar() method 
	//Fox has a String furColor
	//Create class Forest where you create 1 animal of each type 
	
	//Task until: 12:55
}


class Wolf extends Animal
{
	Wolf(String name, int legs) {
		super(name, legs);
	}
	
}

class Bear extends Animal
{

	Bear(String name, int legs) {
		super(name, legs);
	}
	
	public void roar()
	{
		System.out.println("All bears roar!");
	}	
}


class Fox extends Animal
{

	String furColor;
	
	Fox(String name, int legs, String furColor) {
		super(name, legs);
		this.furColor = furColor;
	}
	
}
