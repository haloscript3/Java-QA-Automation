package com.neotech.lesson15;

public class CalculatorWithReturn {

	// our calculator will have 3 methods: add(), multiply(), and divide()

	// add two numbers
	int add(int a, int b) {
		return a + b;
	}

	void add2(int a, int b) {
		System.out.println(a + b);
	}

	// multiply
	int multiply(int a, int b) {
		return a * b;
	}

	// divide
	double divide(double a, double b) {
		double result = a / b;
		return result;
	}
}
