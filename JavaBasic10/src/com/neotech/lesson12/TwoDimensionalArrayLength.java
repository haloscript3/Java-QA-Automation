package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		// lets get the number of rows
		int rows = months.length;
		System.out.println("rows: " + rows);

		int columnsInFirstRow = months[0].length;
		System.out.println("First row has " + columnsInFirstRow + " elements");

		// print the number of elements in serond row
		System.out.println("Number of elements in second row is " + months[1].length);
		
		// can i loop over the elements of a 2-dimensional array
		for (int i = 0; i < months.length; i++) {
			String[] season = months[i];

			for (String month : season) {
				System.out.print(month + " ");
			}

			System.out.println();
		}

	}

}
