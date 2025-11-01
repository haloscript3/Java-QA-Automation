package com.neotech.lesson16;

public class StringMethodsContinue {

	public static void main(String[] args) {

		//.contains()
		String sentence = "We love String methods!";
		
		boolean response = sentence.contains("love");
		System.out.println(response);
		
		
		//how can I check if it contains and ignore the case??
		System.out.println(sentence.toLowerCase().contains("string"));
		//method chaining is very useful
		//it would be the same as this: 
	//	String lower = sentence.toLowerCase();
	//	boolean check = lower.contains("string");
	//	System.out.println(check);
		
		//-----------------------------------

		
		//equals()
		String s1 = "wednesday";
		String s2 = "Wednesday";
		String s3 = new String("Wednesday");
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		System.out.println(s2.equals(s3));
		
		//equalsIgnoreCase()
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		
		//using == to compare strings it does not compare their content
		//it only checks if they references are the same
		
		System.out.println(s2 == s3);
		
		
		//how would you compare two Strings ignoring case without using 
		//equalsIgnoreCase()??
		System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));
		
		//step by step
		String s1Lower = s1.toLowerCase();
		String s2Lower = s2.toLowerCase();
		boolean compare = s1Lower.equals(s2Lower);
		System.out.println(compare);
		
		//-----------------------------------

		//startsWith()
		boolean starts = sentence.startsWith("We");
		System.out.println(starts);
		
		//endsWith 
		boolean ends = sentence.endsWith("us.");
		System.out.println(ends);
	}

}
