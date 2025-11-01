package com.neotech.lesson20;

public class Student {
//	Write a java program of Class Student that takes students name and 3
//	exam scores. 
//	Inside your class also have a method to Calculate Average Score. 
//	Test Student class for 3 different students with different marks. 
//	Your program should print the average mark of each student name.

	String name;
	int score1, score2, score3;

	Student(String studentName, int s1, int s2, int s3) {
		name = studentName;
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}

	Student() {

	}

	int average() {
		int avg = (score1 + score2 + score3) / 3;
		return avg;
	}

	public static void main(String[] args) {

		Student s1 = new Student("Burak", 85, 78, 99);

		int avg1 = s1.average();
		System.out.println(s1.name + ": " + avg1);

		Student s2 = new Student("Ozzy", 81, 88, 89);
		System.out.println(s2.name + ": " + s2.average());

		Student s3 = new Student("Ciara", 92, 85, 100);
		System.out.println(s3.name + ": " + s3.average());

		s3.score2 = 75;
		System.out.println(s3.name + ": " + s3.average());

		Student s4 = new Student();
		s4.name = "Yasir";
		s4.score1 = 90;
		s4.score2 = 81;
		s4.score3 = 88;

		System.out.println(s4.name + ": " + s4.average());

	}

}
