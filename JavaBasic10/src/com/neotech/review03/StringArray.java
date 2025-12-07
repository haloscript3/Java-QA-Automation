package com.neotech.review03;

public class StringArray {

	public static void main(String[] args) {

		String[] animals = { "dog", "cat", "fish", "zebra", "mouse" }; // The length/size 5

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();

		// Advanced/Enhanced for loop (Fancy for loop:)
		for (String element : animals) {
			System.out.print(element + " ");
		}
		System.out.println();

		System.out.println("--------------------------------");
		System.out.println("Let's print the animals in reverse order");
		System.out.println("--------------------------------");

		// The last element's index is -> (length - 1)

		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.print(animals[i] + " ");
		}

		// Print the animals in reverse order using enhanced for loop
		// Not possible, until somebody creates it :)

	}

}
