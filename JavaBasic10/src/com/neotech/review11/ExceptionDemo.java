package com.neotech.review11;

public class ExceptionDemo {

	public static void main(String[] args) {
		divide(6, 3);
		divide(7, 0);
		divide(16, 4);
	}

	public static void divide(int num1, int num2) {

		try {
			int result = num1 / num2;
			System.out.println("The result is -> " + result);
		} catch (Exception ex) {
			// System.out.println("Exception -> " + ex);
			// System.out.println("Exception Message -> " + ex.getMessage());
			// ex.printStackTrace();

			// Print a meaningful message on the console
			// Or maybe write problem/exception into a file
			System.out.println("Problem when dividing -> " + num1 + " by " + num2);
		} finally {
			System.out.println("NeoTech is the best!");
		}

	}

}
