package com.neotech.lesson16;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		char result = st.getGrade(75);
		
		System.out.println("The student grade is: " + result);
		
	}
	
}
