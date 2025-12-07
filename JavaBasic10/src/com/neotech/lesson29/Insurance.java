package com.neotech.lesson29;

/*
Create a class Insurance that will have an attribute as insuranceName and 
unimplemented behaviors as getQuote() and cancelInsurance().
Create 3 subclasses Car, Pet, Health.
Car class has its own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/iterator access all methods of the class.
*/
public abstract class Insurance {

	String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();
}

class CarInsurance extends Insurance {

	String carModel;

	public CarInsurance(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println("The quote for " + carModel + " is $3500");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("Are you sure you want to cancel your insurance?");

	}

}

class PetInsurance extends Insurance {

	String petType;

	public PetInsurance(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;

	}

	@Override
	public void getQuote() {
		System.out.println("The quote for " + petType + " is $150");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("Your insurnace has been cancelled successfully!");

	}

}

class HealthInsurance extends Insurance {

	public HealthInsurance(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("The quote for health insurance is $250");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("Your health insurance is cancelled!!!");

	}

}
