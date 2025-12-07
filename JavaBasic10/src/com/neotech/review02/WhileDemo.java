package com.neotech.review02;

public class WhileDemo {

	public static void main(String[] args) {
		String greeting = "Miremengjes";

//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);

		int num = 1;
		while (num <= 5) {
			System.out.println(num + " " + greeting);
			num++;
		}

		System.out.println("--------------------------------");
		// Same result using different logic

		int number = 0;
		while (number < 5) {
			number++;
			System.out.println(number + " " + greeting);
		}

	}

}
