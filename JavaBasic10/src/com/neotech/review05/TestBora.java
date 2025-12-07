package com.neotech.review05;

public class TestBora {

	public static void main(String[] args) {
		Bora b = new Bora();

		b.addAnyNumbers();
		b.addMyNumbers(6, 7);

		int res = b.addAnyNumbersAndGiveMeTheResult();
		System.out.println("The result was -> " + res);

		int res2 = b.addMyNumbersAndGiveMeTheResult(6, 7);

		if (res2 == 13) {
			System.out.println("Good job Bora!");
		} else {
			System.out.println("I still love!!!");
		}

	}

}
