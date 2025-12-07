package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		// byte < short < int < long < float < double

		int intNumber = 29;

		// widening / implicit casting / automatically
		double doubleNumber = intNumber;

		System.out.println("intNumber -> " + intNumber);
		System.out.println("doubleNumber -> " + doubleNumber);

		// narrowing / explicit casting / manually
		byte byteNumber = (byte) intNumber; // It is risky, you may lose data
		System.out.println("byteNumber -> " + byteNumber);

		// re-assign
		intNumber = 600;

		// in this case we WILL lose data
		byte b2 = (byte) intNumber;
		System.out.println("b2 -> " + b2);

		// widening / implicit casting / automatically
		byte b3 = 50;
		int i3 = b3;
		System.out.println("i3 -> " + i3);

		// narrowing / explicit casting / manually
		double d1 = 7.9999;
		int i4 = (int) d1;
		System.out.println("i4 -> " + i4);

	}

}
