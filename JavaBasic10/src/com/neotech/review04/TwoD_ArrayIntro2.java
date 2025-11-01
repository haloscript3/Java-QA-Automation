package com.neotech.review04;

import java.util.Arrays;

public class TwoD_ArrayIntro2 {

	public static void main(String[] args) {

		// 1D Array
		// int[] num = { 6, 2, 9 };

		// 2D Array
		int[][] nums = { 
				{ 3, 6, 1 }, 
				{ 2, 7, 0 }, 
				{ 8, 2, 9 }, 
				{ 1, 4, 5 }
		};

		System.out.println(nums[1][2]); // number 0
		System.out.println(nums[2][0]); // number 8

		System.out.println(nums[0][2]); // number 1
		System.out.println(nums[3][0]); // number 1

		System.out.println("--------------------------------");

		// Nested enhanced for loop
		for (int[] row : nums) {

			// I will iterate the row (1D-Array) with an enhanced for loop
			for (int element : row) {
				System.out.print(element + " ");
			}

			System.out.println();
		}

		System.out.println("--------------------------------");

		// How to get the row with index 1
		int[] row1 = nums[1];
		System.out.println(Arrays.toString(row1));

		System.out.println("--------------------------------");

		// Combining Enhanced for loop with Normal for loop
		for (int[] row : nums) {

			// I will iterate the row (1D-Array) with a Normal for loop
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i] + " ");
			}

			System.out.println();
		}

	}

}
