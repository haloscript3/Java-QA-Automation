package com.neotech.review04;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {

		int[] numbers = { 5, 21, -3, 9, 30 };

		// When to try to print the Array we see something that doesn't make sense
		System.out.println(numbers);

		// To print a 1D-Array we use toString() method of the Arrays class
		System.out.println(Arrays.toString(numbers));

		int[][] nums = { { 5, 2, 8 }, { 6, 7, 1 }, { 9, 0, 4 } };

		// To print a 2D-Array we use deepToString() method of the Arrays class
		System.out.println(Arrays.deepToString(nums));
	}

}
