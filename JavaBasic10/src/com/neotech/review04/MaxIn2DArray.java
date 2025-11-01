package com.neotech.review04;

public class MaxIn2DArray {

	public static void main(String[] args) {
		// Find the biggest number in a 2D Array

		int[][] b = { 
				{ -3, 4, 6 }, 
				{ 3, 5, 8 }, 
				{ 9, 2, -6 }, 
				{ 4, 12, 1 } 
		};

		int biggest = b[0][0]; // We don't start with zero, numbers may be negative

		for (int row = 0; row < b.length; row++) {

			for (int col = 0; col < b[row].length; col++) {
				int element = b[row][col];

				if (element > biggest) {
					// I found a bigger number
					// I have to update the biggest
					biggest = element;
				}
			}

		}

		System.out.println("The biggest number is -> " + biggest);

		System.out.println("--------------------------------");

		int max = b[0][0];

		for (int[] row : b) {

			for (int element : row) {

				if (element > max) {
					// I found a bigger number
					// I have to update the max
					max = element;
				}
			}

		}

		System.out.println("The max number is -> " + max);

	}

}
