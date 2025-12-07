package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {

		String path = "";

		try {

			FileInputStream fis;
			fis = new FileInputStream(path);

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			// Notify Team A
		}

		catch (Exception e) {
			e.printStackTrace();
			// Notify Team B
		}

		// the app will keep running
		int a = 10;
		int b = 0;

		try {

			System.out.println(a / b);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught!");
		}

		System.out.println("End of the code");

	}

}
