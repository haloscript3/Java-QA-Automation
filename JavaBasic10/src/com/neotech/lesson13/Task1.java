package com.neotech.lesson13;

public class Task1 {
//	 * Create a 2D array of integer type with 3 rows 
//	 and 4 columns and print all values of the array.
	public static void main(String[] args) {

		int[][] numbers = { // parent
				{ 1, 3, 2, 4 }, // child-1
				{ 2, 3, 4, 7 }, // child-2
				{ 5, 6, 1, 2 } // child-3
		};

		// basic for loop
		for (int row = 0; row < numbers.length; row++) {

			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
		}

		System.out.println();

		// advanced for loop
		for (int[] row : numbers) {
			for (int col : row) {
				System.out.print(col + " ");
			}
		}

	}

}
