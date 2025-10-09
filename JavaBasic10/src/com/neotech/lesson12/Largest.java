package com.neotech.lesson12;

public class Largest {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 3, 5, 6, 1, 0, 22, 4 };

		// find the largest number
		int max = numbers[0];
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}

		System.out.println("Max number is " + max);

		// do the same using basic for loop
		int max2 = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max2) {
				max2 = numbers[i];
			}
		}

		System.out.println("Max number is " + max2);

		// task: find the second largest

	}

}
