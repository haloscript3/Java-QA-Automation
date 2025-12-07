package com.neotech.review05;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Pershendetje";

		System.out.println(str.length());

		System.out.println(str.isEmpty());

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str); // The original has NOT changed

		boolean equals = str.equals("PERSHENDETJE");
		System.out.println("equals -> " + equals);

		System.out.println("equalsIgnoreCase -> " + str.equalsIgnoreCase("PERSHENDETJE"));

		System.out.println("--------------------------------");

		System.out.println(str.contains("SH"));
		System.out.println(str.contains("SH".toLowerCase()));

		boolean start = str.startsWith("per");
		System.out.println(start);

		System.out.println("Does Pershendetje start with Pershendetje?");
		System.out.println(str.startsWith("Pershendetje"));

		System.out.println("Does Pershendetje end with E?");
		System.out.println(str.endsWith("E")); // false, because of case sensitivity

		System.out.println("--------------------------------");

		String name = "Kerem" + "-" + "Unal";
		System.out.println(name);

		String name2 = "Kerem".concat("-").concat("Unal"); // Method chaining
		System.out.println(name2);

		String name3 = "Kerem".toUpperCase().concat("-").concat("Unal");
		System.out.println(name3);

		// "Kerem".length().concat("Unal"); //Compile Time Error
		// 5.concat("Unal");

		"Kerem".concat("Unal").length(); // This is OK
		System.out.println("Kerem".concat("Unal").length());

		System.out.println("--------------------------------");

		String str2 = "     Burak   found  the    answer   ";
		System.out.println(str2.trim());

		System.out.println(str2.length());
		System.out.println(str2.trim().length());

		System.out.println("--------------------------------");

		String str3 = "Maya is very happy";
		char letter = str3.charAt(5);
		System.out.println(letter);

		System.out.println("The index of letter 'a' is -> " + str3.indexOf('a'));

		// Find the index of letter 'a', but start looking after index 8
		int indexOfThirdA = str3.indexOf('a', 8);
		System.out.println("indexOfThirdA -> " + indexOfThirdA);

		// When the letter does not exist in the String, returns -1
		System.out.println("The index of letter 'x' is -> " + str3.indexOf('x'));
	}

}
