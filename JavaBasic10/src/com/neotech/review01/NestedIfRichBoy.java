package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRichBoy {
	// If you are a boy
	// If you are rich -- Buy a Ferrari
	// otherwise -- Play soccer

	// If you are a girl
	// If you are rich -- Buy a LV bag
	// otherwise -- Read a book

	// If you are none
	// Invalid gender

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender: (m/f)");
		char gender = scan.next().charAt(0);

		System.out.println("Are you rich? (true/false)");
		boolean rich = scan.nextBoolean();

		if (gender == 'm' || gender == 'M') {
			System.out.println("Yaaay, it's a boy!");

			if (rich) {
				System.out.println("Buy a Ferrari");
			} else {
				System.out.println("Play soccer");
			}

		} else if (gender == 'f' || gender == 'F') {
			System.out.println("oh nooo, it's a girl!");

			if (rich) {
				System.out.println("Buy a LV bag");
			} else {
				System.out.println("Read a book");
			}

		} else {
			System.out.println("Invalid gender");
		}

	}

}
