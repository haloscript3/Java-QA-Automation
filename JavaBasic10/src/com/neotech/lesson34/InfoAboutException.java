package com.neotech.lesson34;

public class InfoAboutException {

	public static void main(String[] args) throws Exception {

		String str = "Hello";

		try {

			// char c = str.charAt(10);
			// System.out.println(c);

			int a = 10;
			int b = 0;
			// System.out.println(a / b);

			Exception ex = new Exception();
			throw (ex);

		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Please stay in index range!");
		}

		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println("You made an arithmetic mistake!");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Something went wrong!");
		}

		// In exceptions:
		// We may handle exceptions using the generic Exception object in catch block
		// Or we may create several catch blocks to handle specific exceptions
		// Catch blocks go from specific to generic

	}

}
