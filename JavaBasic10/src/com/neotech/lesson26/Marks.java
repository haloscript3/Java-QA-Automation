package com.neotech.lesson26;

public abstract class Marks {

//	Task 2:
//	    We have to calculate the average of marks obtained in three subjects 
//	    by student A and by student B. 
//		Create a class 'Marks' with an abstract method 'getAverage' that will be 
//		returning the average of marks. 
//		Provide implementation of the abstract method in classes 'StudentA' and 'StudentB'. 
//		The constructor of StudentA takes the marks of three subjects as parameters 
//		and the constructor of StudentB takes marks of four subjects as parameters. 
//		Test your code.

	abstract double getAverage();

	public static void main(String[] args) {
		StudentA sA = new StudentA(85, 81, 92);
		StudentB sB = new StudentB(85, 78, 96, 99);

		System.out.println("Avg mark for Student A is " + sA.getAverage());
		System.out.println("Avg mark for Student B is " + sB.getAverage());

		sA.setMath(95);
		System.out.println("Updated Avg mark for Student A is " + sA.getAverage());
	}
}

class StudentA extends Marks {
	// instance variables
	private double math, science, english;

	public void setMath(double math) {
		this.math = math;
	}

	// Constructor
	StudentA(double math, double science, double english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	// implementation of the abstract method
	@Override
	double getAverage() {
		return (math + science + english) / 3;
	}
}

class StudentB extends Marks {
	// instance variables
	private double math, science, english, spanish;

	// Constructor
	StudentB(double math, double science, double english, double spanish) {
		this.math = math;
		this.science = science;
		this.english = english;
		this.spanish = spanish;
	}

	// implementation of the abstract method
	@Override
	double getAverage() {
		return (math + science + english + spanish) / 4;
	}
}
