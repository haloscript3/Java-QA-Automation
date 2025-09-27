package com.neotech.lesson09;

public class Homework1 {
	// 1. Write a program using while loop that calculates the
	// sum of the even numbers between 0 and 10.
	public static void main(String[] args) {

		// first solution:
		// System.out.println(2 + 4 + 6 + 8 + 10);

		int i = 2;
		int sum = 0;
		while (i <= 10) {

			if (i % 2 == 0) { // number is even
				sum = sum + i;
			}

			i++;
		}

		System.out.println("The sum of evens is " + sum);

		// 2nd way
		int j = 2;
		int sum2 = 0;
		while (j <= 10) {
			sum2 += j;
			j += 2;
		}

		System.out.println("The sum of evens is " + sum2);

		// change to odd numbers
		int k = 1;
		int sum3 = 0;
		while (k <= 10) {
			sum3 += k;
			k += 2; // k = k + 2;
		}

		System.out.println("The sum of odds is " + sum3);


		// do-while loop
		int x = 2;
		int sum4 = 0;
		do {
			sum4 = sum4 + x;
			x = x + 2;
		} while (x <= 10);

		System.out.println("The sum of evens is " + sum4);
	}

}
