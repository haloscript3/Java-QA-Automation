package com.neotech.review05;

public class Bora {

	// NO parameters and NO return type
	void addAnyNumbers() {
		int result = 5 + 9;
	}

	// TWO parameters and NO return type
	void addMyNumbers(int num1, int num2) {
		int result = num1 + num2;
	}

	// NO parameters and WITH return type
	int addAnyNumbersAndGiveMeTheResult() {
		int result = 5 + 9;
		return result;
	}

	// TWO parameters and WITH return type
	int addMyNumbersAndGiveMeTheResult(int a, int b) {
		int result = a + b;
		return result;
	}

}
