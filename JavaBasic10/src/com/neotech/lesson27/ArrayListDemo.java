package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);

		System.out.println("Element at index 2 is " + numbers.get(2));
		System.out.println("Does numbers contain 30? " + numbers.contains(30));
		System.out.println("Does numbers contain 50? " + numbers.contains(50));

		System.out.println(numbers);

		// remove item at index 0
		numbers.remove(0);

		System.out.println(numbers);

		numbers.add(50);
		System.out.println(numbers);

		Integer i = 50;
		numbers.remove(i);
		System.out.println(numbers);

		numbers.clear();
		System.out.println(numbers);

	}

}
