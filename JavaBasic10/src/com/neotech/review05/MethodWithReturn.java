package com.neotech.review05;

public class MethodWithReturn {

	public static void main(String[] args) {

		String name = "Cris";
		int numOfChars = name.length();
		System.out.println("The length of the string is -> " + numOfChars);
		System.out.println("--------------------------------");

		MethodWithReturn m = new MethodWithReturn();

		boolean res = m.isOdd(8);
		System.out.println("Is 8 odd? " + res);

		boolean res2 = m.isOddEnhanced(17);
		System.out.println("Is 17 odd? " + res2);

		System.out.println("294 -> " + m.isOddEnhanced(294));
	}

	// If this one is confusing, it's OK, don't worry
	// Divide the number by 2 (modulus)
	// If the result is equal to 1 -> return true
	// otherwise -> return false
	boolean isOddEnhanced(int num) {
		return num % 2 == 1;
	}

	boolean isOdd(int num) {
		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
