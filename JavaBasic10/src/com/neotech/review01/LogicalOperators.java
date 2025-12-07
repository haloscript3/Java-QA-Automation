package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperators {
	// Ask the user to enter the age
	// If age is 0 --> You are a newborn
	// If age is from 1 to 3 --> You are a baby
	// If age is from 4 to 5 --> You are a toddler
	// If age is from 6 to 12 --> You are a kid
	// If age is from 13 to 19 --> You are a teenager
	// If age >= 20 --> You are an adult

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your age:");
		int age = input.nextInt();

		if (age == 0) {
			System.out.println("You are a newborn");
		} else if (age >= 1 && age <= 3) { // using AND is better for range
			System.out.println("You are a baby");
		} else if (age == 4 || age == 5) { // using OR is better for individual values
			System.out.println("You are a toddler");
		} else if (age >= 6 && age <= 12) {
			System.out.println("You are a kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are a teenager");
		} else if (age >= 20) {
			System.out.println("You are an adult");
		} else {
			System.out.println("You are not born yet!");
		}

	}

}
