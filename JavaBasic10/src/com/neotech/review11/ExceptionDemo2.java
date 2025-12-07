package com.neotech.review11;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		int[] numbers = new int[3];

		try {
			for (int i = 0; i <= 3; i++) {
				numbers[i] = 5;
			}

			System.out.println("Will this line be executed?"); // NO
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Another message will be executed?"); // YES

			// System.out.println(e);
			// System.out.println(e.getMessage());
			// e.printStackTrace();

			// Print a meaningful message
			System.err.println("Error: You are assigning an element outside of the array!");
		}

		System.out.println("Continue code execution..."); // YES

	}

}
