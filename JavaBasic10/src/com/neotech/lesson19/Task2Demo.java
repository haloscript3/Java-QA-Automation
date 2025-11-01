package com.neotech.lesson19_1;

import com.neotech.lesson19.Task2;

public class Task2Demo {

	public static void main(String[] args) {
		
		String day = "Thursday";
		
		String reversed = Task2.reverse(day);
		System.out.println("The reversed string is: " + reversed);
		
		System.out.println(Task2.reverse2(day));
	}
}
