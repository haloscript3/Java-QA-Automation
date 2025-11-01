package com.neotech.lesson22;

public class AdditionTest {

	public static void main(String[] args) {

		Addition obj = new Addition();
		
		obj.add(5, 7);
		
		obj.add(5.5, 7);
		
		obj.add(15.7, 3.3);
		
		obj.add(5, 10, 15.0);
		
		obj.add("October", 30);
		obj.add(30, "October");
		
	}

}
