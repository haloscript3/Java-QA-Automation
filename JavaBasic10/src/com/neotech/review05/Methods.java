package com.neotech.review05;

public class Methods {

	void printWelcomeFiveTimes() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void printWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void printGreetingFiveTimes(String greeting) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	void printGreetingWithNumber(String greeting, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Methods m = new Methods();
		m.printWelcomeFiveTimes();

		m.printWelcomeWithNumber(3);
		m.printWelcomeWithNumber(7);

		// Compile-time error: The method accepts only integers, not String
		// m.printWelcomeWithNumber("5");

		m.printGreetingFiveTimes("Bonjour");
		m.printGreetingFiveTimes("Merhaba");

		System.out.println("--------------------------------");

		m.printGreetingWithNumber("Hola", 6);
		m.printGreetingWithNumber("Salam", 4);

		// Compile-time error: You have to provide 2 parameters -> String & int
		// m.printGreetingWithNumber("Hi");

		// The order of parameters is important
		// m.printGreetingWithNumber(5, "Hi");

		// Terminology -> invoke/call/execute a method
	}

}
