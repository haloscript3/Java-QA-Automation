package com.neotech.review02;

public class SumEvenOddForLoop {
	// Add Even numbers
	// Also add Odd numbers
	// Also add All numbers
	// Between 1 && 20
	// Using for loop

	public static void main(String[] args) {

		int sumOdd = 0;
		int sumEven = 0;
		int total = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) { // even
				sumEven += i;
			} else { // odd
				sumOdd += i;
			}

			total += i;
		}

		System.out.println("The sum of even numbers -> " + sumEven);
		System.out.println("The sum of odd numbers -> " + sumOdd);
		System.out.println("The sum of all numbers -> " + total);

	}

}
