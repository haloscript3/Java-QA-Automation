package com.neotech.lesson17;

import java.util.Scanner;

public class Homework3 {
	/*
	Write a program that reads two parent's first names and if they expecting boy or girl?
	Based on the input suggests a name for a baby:
	If it is a boy get half from dad and half from mom.
	If it is a girl get half from mom and half from dad.
	
	    Example Output:
	        Mom's first name? Mary
	        Dad's first name? Daniel
	        Boy or Girl? boy
	        Suggested baby name: DANRY
	    Example Output:
	        Mom's first name? Mary
	        Dad's first name? Daniel
	        Boy or Girl? girl
	        Suggested baby name: MAIEL
	*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter father's name:");
		String fName = scan.next();

		System.out.println("Enter mother's name:");
		String mName = scan.next();

		System.out.println("Are you expecting a boy or a girl?");
		String gender = scan.next();

		if (gender.equalsIgnoreCase("boy")) {
			// get first half of fathers name +
			// get second half of mothers name
			String firstHalf = fName.substring(0, fName.length() / 2);
			String secondHalf = mName.substring(mName.length() / 2);
			String babysName = firstHalf + secondHalf;
			System.out.println(babysName.toUpperCase());

		} else if (gender.equalsIgnoreCase("girl")) {
			// get first half of mothers name +
			// get second half of fathers name
			String firstHalf = mName.substring(0, mName.length() / 2);
			String secondHalf = fName.substring(fName.length() / 2);
			String babysName = firstHalf + secondHalf;
			System.out.println(babysName.toUpperCase());
		} else {
			System.out.println("invalid entry!!!");
		}

		scan.close();
	}

}
