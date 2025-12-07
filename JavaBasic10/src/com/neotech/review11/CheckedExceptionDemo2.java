package com.neotech.review11;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {

		System.out.println("Hello Java!");

		try {
			Thread.sleep(5000); // Waiting for 5000ms = 5sec
		} catch (InterruptedException e) {
			System.out.println("Something went wrong while waiting!");
		}

		System.out.println("Bye Java!");

	}

}
