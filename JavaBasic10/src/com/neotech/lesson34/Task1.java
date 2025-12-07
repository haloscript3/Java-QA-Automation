package com.neotech.lesson34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	// How would you handle the InputMismatchException?
	// InputMismatchException when user enters mismatch value then programmer
	// expected.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int age;
		String name;

		try {
			System.out.println("Enter your name:");
			name = scan.nextLine();

			System.out.println("Enter your age:");
			age = scan.nextInt();

			System.out.println("Name: " + name + " Age: " + age);
		}

		catch (InputMismatchException e) {
			System.out.println("Please enter an integer for age!!!");
		}

		catch (Exception e) {
			System.out.println(e);
		} finally {
			scan.close();
			System.out.println("");
		}
	}

}
