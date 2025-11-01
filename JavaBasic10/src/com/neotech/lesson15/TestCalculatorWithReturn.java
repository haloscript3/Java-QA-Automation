package com.neotech.lesson15;

public class TestCalculatorWithReturn {

	public static void main(String[] args) {

		CalculatorWithReturn cal = new CalculatorWithReturn();

		int result = cal.add(14, 89);
		System.out.println(result);
		// OR
		System.out.println(cal.add(45, 66));

		// this will return nothing; it will just print the result in console
		cal.add2(55, 39);

	}

}
