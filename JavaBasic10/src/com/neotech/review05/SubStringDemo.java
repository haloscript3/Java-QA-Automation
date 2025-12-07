package com.neotech.review05;

public class SubStringDemo {

	public static void main(String[] args) {
		String longStr = "I am very happy today because today is not Monday";

		String anotherStr = longStr.substring(5, 8); // 8 is NOT included
		System.out.println(anotherStr);

		String anotherStr2 = longStr.substring(5);
		System.out.println(anotherStr2);

		System.out.println("longStr -> " + longStr); // NO change

		longStr = longStr.substring(10);
		System.out.println("longStr -> " + longStr); // YES change

		// Run-time Error
		// longStr.substring(5, 2);
		// longStr.substring(5, 100);
		// longStr.substring(-5, 5);
	}

}
