package com.neotech.lesson13;

public class RetreivingValuesFrom2DArrays {

	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		// the array has two dimensions: [4][3]
		int rows = months.length;
		System.out.println(rows);

		int colsOfFirstRow = months[0].length;
		System.out.println(colsOfFirstRow);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < months[i].length; j++) {
				System.out.print(months[i][j] + " ");
			}
			System.out.println();
		}


		System.out.println("---------------------");

		int[][] numbers = { { 1, 3, 2, 4 }, { 2, 3, 4, 7, 1, 0, 9 }, { 10 }, { 5, 6 } };

		for (int i = 0; i < numbers.length; i++) {
			// I need to make sure the inner loop runs for every item of the row
			for (int j = 0; j < numbers[i].length; j++) {
				// what is the value of numbers[i].length for i=1? 7
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}

}
