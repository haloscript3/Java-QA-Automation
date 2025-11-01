package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		System.out.println("Test the addition:");
		cal.add(14, 89);
		cal.add(48, 72);

		System.out.println("Test the multiplication:");
		cal.multiply(377, 912);
		cal.multiply(3, 5);

		System.out.println("Test the division:");
		cal.divide(498, 18);
		cal.divide(36, 9);
	}

}
