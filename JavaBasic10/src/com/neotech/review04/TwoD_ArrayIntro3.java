package com.neotech.review04;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {

		int[][] nums = { 
				{ 8, 5 }, 
				{ 9, 1, 6, 2 }, 
				{ 7 } 
		};

		System.out.println(nums[1][2]); // 6
		System.out.println(nums[2][0]); // 7

		// System.out.println(nums[0][2]); // run-time error

		System.out.println("--------------------------------");

		System.out.println("The number of the rows is -> " + nums.length);
		System.out.println("The length of the row with index 1 is -> " + nums[1].length);
		System.out.println("The length of the row with index 0 is -> " + nums[0].length);
		System.out.println("The length of the row with index 2 is -> " + nums[2].length);

		System.out.println("--------------------------------");

		// Nested for loop
		for (int row = 0; row < nums.length; row++) {

			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
			}

			System.out.println();
		}

		System.out.println("--------------------------------");

		// Nested enhanced/advanced for loop
		for (int[] row : nums) {

			for (int element : row) {
				System.out.print(element + " ");
			}

			System.out.println();
		}

	}

}
