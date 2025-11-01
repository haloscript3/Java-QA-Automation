package com.neotech.lesson16;

public class Student {

	/*
	Create a class Student that will have a method getGrade.
	Your method should accept the score of a student and return a grade:
		score > 90 - A
		score > 80 - B
		score > 70 - C
		score > 50 - D
		anything else - F
	 
	 */
	
	// What is the return type of the method? char 
	// What is name of the method? getGrade();
	// What is/are the inputs of this method? score (byte, short, int)
	// What is the logic inside the method? selective execution based on the score 
	
	char getGrade(int score)
	{
		char grade;
		
		if (score > 90)
		{
			grade = 'A';
		}
		else if (score > 80)
		{
			grade = 'B';
		}
		else if (score > 70)
		{
			grade = 'C';
		}
		else if (score > 50)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		 
		return grade;
	}
	
	
	//we can use this within this class or on another class
	
	public static void main(String[] args) {
		
		Student st = new Student();
		
		char result = st.getGrade(75);
		
		System.out.println("The student grade is: " + result);
		
	}
	
	
	
}
