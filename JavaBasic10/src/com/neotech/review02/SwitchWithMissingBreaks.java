package com.neotech.review02;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {

		int num = 1;

		switch (num) {
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
		case 7:
			System.out.println("7");
		default:
			System.out.println("The number was not 3,4,5,6,7");
		}

		// Limitations of switch-case

		// 1. You cannot have duplicate cases

		// 2. You should be careful with breaks

		// 3. You cannot use logical operators like in if-else
		if (num == 3 || num == 5 || num == 7) {

		}

		// 4. You cannot use comparison operators
		if (num <= 5) {

		}

		// 5. You cannot use double
		double d = 3.4;
		if (d == 5.1) {

		} else {

		}

	}

}
