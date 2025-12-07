package com.neotech.lesson23;
/*
 * Write program: Shape class has a constructor that takes the radius and has a subclass as 
 * Circle class. In Circle class create a method to calculate the area of circle. 
 * Test your code
 */

public class Shape {

	int radius;

	public Shape(int radius) {
		this.radius = radius;
	}
}

class Circle extends Shape {

	public Circle(int radius) {
		super(radius);
	}

	void calculateArea() {
		System.out.println("The area of the circle is " + Math.PI * this.radius * this.radius);
	}
}
