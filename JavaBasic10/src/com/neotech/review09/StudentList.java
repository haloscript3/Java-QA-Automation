package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	public void studentInfo() {
		System.out.println("Student's name is -> " + name);
	}
}

public class StudentList {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();

		// studentList.add("Collin"); // Not possible to store String

		Student s1 = new Student("Collin"); // Creating an object of Student

		studentList.add(s1); // Adding the student into the ArrayList
		studentList.add(new Student("Yasir")); // Adding the new student object directly
		studentList.add(new Student("Eo"));

		System.out.println("Size -> " + studentList.size());

		System.out.println("----Enhanced for loop----");

		for (Student element : studentList) {
			element.studentInfo();
		}

		System.out.println("----Iterator----");

		Iterator<Student> it = studentList.iterator();

		while (it.hasNext()) {
			// 1st way
			// Student s = it.next();
			// s.studentInfo();

			// 2nd way
			it.next().studentInfo(); // Method chaining
		}

	}

}
