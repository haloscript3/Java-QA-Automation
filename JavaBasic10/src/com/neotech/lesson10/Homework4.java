package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {
//	4. Create a program that will be asking the user to apply for 
//	a credit card 10 times. As soon you get a "yes" from the 
//	user, the program should stop asking.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String answer;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Would you like to apply for a credit card? (Yes or No)");
			answer = scan.next();

			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Perfect, lets start!");
				break;
			}
		}

		scan.close();

	}

}
