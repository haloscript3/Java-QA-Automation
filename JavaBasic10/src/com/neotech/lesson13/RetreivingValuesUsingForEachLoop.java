package com.neotech.lesson13;

public class RetreivingValuesUsingForEachLoop {

	public static void main(String[] args) {

		String[][] animals = { // parent
				{ "eagle", "cat", "dog" }, // child-1
				{ "zebra", "elephant", "panda" }, // child-2
				{ "goat", "cow", "lion" }// child-3
		};

		// lets loop over the items of the animals array
		// using basic loop
		for (int i = 0; i < animals.length; i++) {

			for (int j = 0; j < animals[i].length; j++) {
				System.out.print(animals[i][j] + " ");
			}

		}

		System.out.println();

		// using advanced for loop
		for (String[] row : animals) {
			for (String col : row) {
				System.out.print(col + " ");
			}
		}

	}

}
