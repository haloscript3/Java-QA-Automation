package com.neotech.lesson10;

public class Task3 {

	/*
	 
	    *
	   * *
	  * * *
	 * * * *
	* * * * *
		 
		 */
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			// lets do the spaces first
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			// lets do the stars
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
