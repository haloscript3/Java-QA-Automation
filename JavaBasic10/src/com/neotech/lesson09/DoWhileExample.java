package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		// ask user to guess your lucky number
		int luckyNumber = 11;

		Scanner input = new Scanner(System.in);
		int usersGuess;

		// do-while loop
		do {
			System.out.println("Guess my lucky number:");
			usersGuess = input.nextInt();
		} while (usersGuess != luckyNumber);

		System.out.println("You got it!!!");

		// while loop
//		System.out.println("What is my lucky number?");
//		usersGuess = input.nextInt();
//
//		while (usersGuess != luckyNumber) {
//			System.out.println("Wrong guess, try again!!!");
//			usersGuess = input.nextInt();
//		}
//
//		System.out.println("You got it!!!");

		input.close();
	}

}
