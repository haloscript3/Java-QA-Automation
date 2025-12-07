package com.neotech.review10;

import java.util.*;
import java.util.Map.Entry;

public class StudentPassFail {

	public static void main(String[] args) {

		Map<String, Integer> studentGradeMap = new TreeMap<>();
		studentGradeMap.put("Olga", 95);
		studentGradeMap.put("Sertan", 58);
		studentGradeMap.put("Cihan", 82);
		studentGradeMap.put("June", 91);
		studentGradeMap.put("Yildirim", 75);
		studentGradeMap.put("Nur", 45);

		System.out.println("studentGradeMap -> " + studentGradeMap);

		// Passing grade is 70
		Map<String, Integer> passingStudents = new TreeMap<>();
		Map<String, Integer> failingStudents = new TreeMap<>();

		for (String studentName : studentGradeMap.keySet()) {
			// get the score by using the student name
			Integer score = studentGradeMap.get(studentName);

			if (score >= 70) {
				// passing
				passingStudents.put(studentName, score);
			} else {
				// failing
				failingStudents.put(studentName, score);
			}
		}

		System.out.println("Passing Students -> " + passingStudents);
		System.out.println("Failing Students -> " + failingStudents);

		System.out.println("--------------------------------");

		// ONLY for Nur & Emre
		// Do the same task using EntrySet()

		// re-initialize the maps
		passingStudents = new TreeMap<>();
		failingStudents = new TreeMap<>();

		for (Entry<String, Integer> entry : studentGradeMap.entrySet()) {
			if (entry.getValue() >= 70) {
				passingStudents.put(entry.getKey(), entry.getValue());
			} else {
				failingStudents.put(entry.getKey(), entry.getValue());
			}
		}

		System.out.println("Passing Students -> " + passingStudents);
		System.out.println("Failing Students -> " + failingStudents);

	}
}
