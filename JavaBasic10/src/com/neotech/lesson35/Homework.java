package com.neotech.lesson35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework {
	/*
	 * Create a static method that will return a List of Exceptions. Inside your
	 * method create objects of 4 exception classes using try and catch blocks and
	 * store them inside your list. Call your method inside main and print name and
	 * details of all Exception objects.
	 */
	public static void main(String[] args) {
		// get the list of the exceptions into a variable
		List<Exception> exceptionList = getAllExceptions();

		// iterate through the items of the exception list
		Iterator<Exception> it = exceptionList.iterator();

		while (it.hasNext()) {
			it.next().printStackTrace();
			// System.out.println(it.next());
		}

	}

	public static List<Exception> getAllExceptions() {

		List<Exception> toReturn = new ArrayList<>();

		// lets create some exceptions

		// 1st exception
		try {

			int[] numbers = { 1, 2, 3, 4, 5, 6 };
			System.out.println(numbers[10]);

		} catch (ArrayIndexOutOfBoundsException e) {
			toReturn.add(e);
		}

		// 2nd exception
		try {

			Object obj = new Double(50);
			Integer i = (Integer) obj;

		} catch (ClassCastException e) {
			toReturn.add(e);
		}

		// 3rd exception
		try {

			int a = 10;
			int b = 0;
			System.out.println(a / b);

		} catch (ArithmeticException e) {
			toReturn.add(e);
		}

		// 4th exception
		try {

			int[] negArray = new int[-1];

		} catch (NegativeArraySizeException e) {
			toReturn.add(e);
		}

		return toReturn;
	}

}
