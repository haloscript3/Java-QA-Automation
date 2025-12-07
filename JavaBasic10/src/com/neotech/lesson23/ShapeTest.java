package com.neotech.lesson23;

public class ShapeTest {

	public static void main(String[] args) {

		Shape s = new Shape(5);
		// s.calculateArea(); -> not allowed because the method belong the Circle class

		// Shape s1 = new Shape(); -> not allowed because there is no default
		// constructor

		Circle c1 = new Circle(7);
		c1.calculateArea();

		Circle c2 = new Circle(10);
		c2.calculateArea();
	}

}
