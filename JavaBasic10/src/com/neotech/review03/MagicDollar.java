package com.neotech.review03;

public class MagicDollar {
	// $$$$$
	// $$$$$
	// $$$$$
	// $$$$$

	public static void main(String[] args) {

		// 1st silly way
//		System.out.println("$$$$$");
//		System.out.println("$$$$$");
//		System.out.println("$$$$$");
//		System.out.println("$$$$$");

		// 2nd silly way
//		for (int i = 1; i <=4; i++) {
//			System.out.println("$$$$$");
//		}

		// Serious way
//		for (int i = 1; i <= 4; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("$");
//			}
//
//			System.out.println();
//		}
		
		// Task (make some changes on pattern)
		// $$$$$
		// $   $
		// $   $
		// $$$$$

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 || i == 4 || j == 1 || j == 5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}

	}

}
