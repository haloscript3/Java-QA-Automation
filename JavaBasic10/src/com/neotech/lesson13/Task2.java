package com.neotech.lesson13;

public class Task2 {
//	 * Create a 2D array of integer type with 3 rows and different number of columns and print all
//	 *  EVEN values of the array.
	public static void main(String[] args) {

		int[][] numbers = { // parent
				{ 1, 3, 2, 4 }, // row-1
				{ 2, 3, 4 }, // row-2
				{ 5, 6, 1, 2, 6, 8, 12, 88 } // row-3
		};

		// basic for loop
		for (int row = 0; row < numbers.length; row++) {

			for (int col = 0; col < numbers[row].length; col++) {
				if (numbers[row][col] % 2 == 0) {
					System.out.print(numbers[row][col] + " ");
				}
			}
		}

		System.out.println();

		// advanced for loop
		for (int[] row : numbers) {
			for (int col : row) {
				if (col % 2 == 0) {
					System.out.print(col + " ");
				}
			}
		}

	}

}
