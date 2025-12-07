package com.neotech.lesson29;

import java.util.ArrayList;

public class Homework1 {
	// Create an arrayList of drinks. If any drink has letter "a" or "e"
	// replace it with water.
	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();

		drinks.add("Coffee"); // index 0
		drinks.add("Soda");
		drinks.add("Milk");
		drinks.add("Tea");
		// How can i add Water after coffee?
		drinks.add(1, "Water");

		System.out.println(drinks);

		// lets loop over the items of the array list
		for (String drink : drinks) {
			// check if the drink contains a or e
			if (drink.contains("a") || drink.contains("e")) {
				// drink = drink.replace(drink, "Water");
				drink = "Water";
			}

			System.out.print(drink + " ");
		}

		System.out.println();

		// The list is NOT updated
		System.out.println(drinks);

		// We can use basic for loop to update the ArrayList
		for (int i = 0; i < drinks.size(); i++) {
			String drink = drinks.get(i);
			if (drink.contains("a") || drink.contains("e")) {
				// update the array list
				drinks.set(i, "Water");
			}
		}

		System.out.println(drinks);

	}

}
