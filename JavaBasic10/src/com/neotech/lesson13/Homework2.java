package com.neotech.lesson13;

public class Homework2 {
	/*
	 Create a 2D array that first row will contain 4 names and second row will contain 
	 grades, all Strings.
	 Then you program should print name of the students that has A or B grade 
	 
	 */
	public static void main(String[] args) {

		String[][] studentsAndGrades = { { "Eo", "Oguzhan", "Esmeralda", "Volkan" }, { "B", "C", "A", "A" } };

		// do it manually
		System.out.println("Manual solution:");
		System.out.println(studentsAndGrades[0][1]); // Oguzhan
		System.out.println(studentsAndGrades[0][2]); // Esmeralda

		// Lets find the number of items in each row
		System.out.println("There are " + studentsAndGrades.length + " rows!");
		System.out.println("Number of columns/items in first row: " + studentsAndGrades[0].length);
		System.out.println("Number of columns/items in second row: " + studentsAndGrades[1].length);

		System.out.println("Reliable solution:");
		String[] names = studentsAndGrades[0]; // first row
		String[] grades = studentsAndGrades[1]; // second row

		for (int i = 0; i < grades.length; i++) {
			String grade = grades[i];
			if (grade.equals("A") || grade.equals("B")) {
				String name = names[i];
				System.out.println(name);
			}
		}
	}

}
