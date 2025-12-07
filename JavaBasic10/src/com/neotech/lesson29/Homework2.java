package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {
	// Create an ArrayList of even numbers from 1 to 50.
	// Using Iterator remove any number that is divisible by 5 from that ArrayList.
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		// do NOT do this! work smart!
//		numbers.add(2);
//		numbers.add(4);
//		numbers.add(6);

		for (int i = 2; i <= 50; i += 2) {
			numbers.add(i);
		}

		Iterator<Integer> it = numbers.iterator();
		// hasNext() -> checks if there is a next item
		// next() -> it returns the element where the cursor is at and moves the cursor
		// on that item
		// remove() -> removes the item that iterator currently points

		while (it.hasNext()) {
			Integer number = it.next();

			// check if the number is divisible by 5
			if (number % 5 == 0) {
				it.remove();
			}
		}

		System.out.println(numbers);

	}

}
