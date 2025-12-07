package com.neotech.lesson34;

public class ExceptionIntro {

	public static void main(String[] args) throws Exception {

		int a = 10;
		int b = 0;

		// runtime exception
		// System.out.println(a / b); // ArithmeticException

		// checked exception -> detected during compile time
		String filePath = "";
		// FileInputStream fis = new FileInputStream(filePath); //FileNotFoundException

		Exception ex = new Exception();
		// throw (ex); // --> execution stops right away

		System.out.println("Hi there!");

		NullPointerException npe = new NullPointerException();
		// throw (npe);

		System.out.println("End of our code");

		// If an exception happens; IT HAS TO BE HANDLED
		// If not handled properly; the code execution stops immediately

	}

}
