package com.neotech.review03;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {

		int[][] numbers = new int[3][4]; // [row][columns]

		numbers[0][0] = 9;
		numbers[2][0] = 6;
		numbers[1][2] = 5;

		// re-assign a value to one element
		numbers[1][2] += 2; // incrementing by 2

		// compile-time error -> Before running the code
		// numbers[0][3] = "cat";

		// run-time error -> After running the code
		// numbers[3][1] = 4;

		int rows = numbers.length;
		System.out.println("The number of rows is -> " + rows);

		// The length of the row with index 1
		int row1 = numbers[1].length;
		System.out.println("The length of the row with index 1 is -> " + row1);

		System.out.println("--------------------------------");

		int[][] numbers2 = { 
				{ 8, 5, 9 }, 
				{ 7, 3, 6 }, 
				{ 5, 4, 1 }, 
				{ 8, 2, 7 } 
		};
		
		// numbers2.length is 4
		// numbers2[1].length is 3

		// The index of 9 is -> 0,2
		// The index of 3 is -> 1,1
		// The index of 8 is -> 0,0
		// The index of 8 is -> 3,0
	}

}
