package com.neotech.lesson09;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		System.out.println("-------Break------");
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}

			System.out.print(i + " ");
		}

		System.out.println("\n\n-------Continue------");

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}

			System.out.print(i + " ");
		}

	}

}
