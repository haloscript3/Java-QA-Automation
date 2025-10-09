package com.neotech.lesson13;

public class Task3 {
//	 * Create a 2D array of integer type with 3 rows and different number of columns. 
//  Print the sum of the numbers in the array.
	public static void main(String[] args) {

		int[][] numbers = { // parent
				{ 1, 3, 2, 4 }, // row-1
				{ 2, 3, 4, 7, 2, 33, 11 }, // row-2
				{ 5 } // row-3
		};

		// basic for loop
		int sum = 0;
		for (int row = 0; row < numbers.length; row++) {

			for (int col = 0; col < numbers[row].length; col++) {
				sum += numbers[row][col];
			}
		}

		System.out.println(sum);

		// advanced for loop
		int sum2 = 0;
		for (int[] row : numbers) {
			for (int col : row) {
				sum2 += col;
			}
		}

		System.out.println(sum2);

	}

}
