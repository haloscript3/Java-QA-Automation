package com.neotech.lesson27;

public class WrapperClasses {

	public static void main(String[] args) {

		int num = 10;

		// boxing an int into an Integer object
		Integer num1 = new Integer(10);

		// un-boxing: getting the value from the object
		int num2 = num1.intValue();

		Integer num3 = 20; // auto boxing
		int num4 = num3; // auto un-boxing

		// what is the max value of integer?
		System.out.println(Integer.MAX_VALUE);
		// min value of integer
		System.out.println(Integer.MIN_VALUE);

		Byte b1 = 25;
		System.out.println(b1);

		Double d1 = 4.5;
		double d2 = d1;// auto un-boxing

		Character c1 = '%';
		char c2 = c1;// auto un-boxing

		Boolean bool1 = true;
		boolean bool2 = bool1;

	}

}
