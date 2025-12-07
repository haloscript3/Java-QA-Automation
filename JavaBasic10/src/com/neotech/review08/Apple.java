package com.neotech.review08;

// A class can extend one and only one class
// A class can implement multiple interfaces
public class Apple extends Fruit implements Peelable, Washable {

	public Apple(String color) {
		super(color);
	}

	public void peel() {
		System.out.println("Peeling the " + color + " Apple.");
	}

	public void wash() {
		System.out.println("Washing the " + color + " Apple.");
	}

}
