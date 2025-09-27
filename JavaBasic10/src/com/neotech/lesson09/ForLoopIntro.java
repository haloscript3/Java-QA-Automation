package com.neotech.lesson09;

public class ForLoopIntro {

	public static void main(String[] args) {

		// lets print the numbers between 1 and 10

		// while loop solution
		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println();
		System.out.println("--------------");

		// for loop solution
		for (int num2 = 1; num2 <= 10; num2++) {
			System.out.print(num2 + " ");
		}

		// can i print the value of num? YES
		System.out.println(num);

		// can i print the value of num2? NO
		// System.out.println(num2);
	}

}
