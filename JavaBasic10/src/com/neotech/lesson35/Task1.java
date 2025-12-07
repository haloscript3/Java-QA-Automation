package com.neotech.lesson35;

public class Task1 {
	/*
	 * Create a method to check age eligibility that will throw a runtime exception.
	 * Method should throw an exception if age is less than 16.
	 * 
	 */
	public static void main(String[] args) {

		try {

			checkAge(18);
			checkAge(15);

		} catch (CantDriveException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println("Something went wrong!!!");
			e.printStackTrace();
		}

	}

	public static void checkAge(int age) {
		if (age < 16) {
			// throw new RuntimeException("You can not drive!!!");
			throw new CantDriveException("You can not drive!!!");
		} else {
			System.out.println("Drive safe!");
		}
	}

}

class CantDriveException extends RuntimeException {
	public CantDriveException(String msg) {
		super(msg);
	}
}
