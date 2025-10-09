package com.neotech.lesson13;

public class Task4 {
//	Create an array of cars : American, German, Korean, Italian. 
//	Then retrieve all values from that array using 2 different loops
	public static void main(String[] args) {

		String[][] cars = { // parent
				{ "Ford", "Chevy", "Jeep" }, // American
				{ "BMW", "Mercedes", "Audi" }, // German
				{ "Kia", "Hyundai" }, // Korean
				{ "Ferrari" } // Italian
		};

		// using adv for loop
		for (String[] row : cars) {
			for (String col : row) {
				System.out.print(col + " ");
			}
		}

		// using basic loop: do it yourself!

	}

}
