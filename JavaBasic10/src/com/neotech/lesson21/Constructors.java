package com.neotech.lesson21;

public class Constructors {

	// default
	public Constructors() {
		this(5);
		System.out.println("Default constructor");
	}

	// 2nd constructor
	Constructors(int x) {
		this(3, 4);
		System.out.println("2nd constructor");
	}

	// 3rd constructor
	Constructors(int x, int y) {
		System.out.println("3rd constructor");
	}

	public static void main(String[] args) {
		
		Constructors cs1 = new Constructors();
		// default -> 2nd -> 3rd -> 2nd -> go back to default

		System.out.println("--------------");

		Constructors cs2 = new Constructors(9);

	}

}
