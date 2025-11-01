package com.neotech.lesson19;

public class Task1Demo {
	public static void main(String[] args) {

		Task1 obj = new Task1();

		int[] array = { 55, 34, 87, 90, 43 };

		int sum = obj.sumOfArray(array);
		System.out.println("The total sum of the array elements is: " + sum);
	}
}
