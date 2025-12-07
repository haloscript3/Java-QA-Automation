package com.neotech.review02;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("Similarities between WHILE & DO-WHILE");

		int age = 1;
		while (age <= 10) {
			System.out.println("Happy Birthday! You are " + age + " years old!");
			age++;
		}

		System.out.println("--------------------------------");

		int age2 = 1;
		do {
			System.out.println("Happy Birthday! You are " + age2 + " years old!");
			age2++;
		} while (age2 <= 10);

		System.out.println("--------------------------------");
		System.out.println("Differences between WHILE & DO-WHILE");
		System.out.println("--------------------------------");

		boolean hot = true;

		while (!hot) {
			System.out.println("While loop -> Drink");
		}

		do {
			System.out.println("Do-While loop -> Drink");
		} while (!hot);

	}

}
