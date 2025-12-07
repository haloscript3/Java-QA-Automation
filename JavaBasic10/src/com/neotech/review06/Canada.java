package com.neotech.review06;

public class Canada {

	public static void main(String[] args) {
		USA us = new USA();

		System.out.println("Accessing the variables from inside Canada");

		System.out.println("public -> " + us.bestSchool);
		System.out.println("default -> " + us.state);
		System.out.println("protected -> " + us.mainState);

		// capitalCity is private
		// System.out.println("private -> " + us.capitalCity);

		System.out.println("--------------------------------");

		System.out.println("Accessing the methods from inside Canada");

		us.attendNeoTech();
		us.playNBA();

		// selectPresident() is private
		// us.selectPresident();

	}

}
