package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {

		// Funny way
		int s1 = 93;
		int s2 = 85;
		int s3 = 90;
		int s4 = 98;

		int sum = s1 + s2 + s3 + s4;
		System.out.println("The sum is -> " + sum);

		// 1st serious way
		int[] grades = new int[4];
		grades[2] = 90;
		grades[0] = 93;
		grades[3] = 98;
		grades[1] = 85;

		// int size = grades.length;
		// The size of the array is 4
		// The index of the last element is 3

		int total = 0;
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}

		System.out.println("The total of the array is -> " + total);

		// 2nd serious way
		int[] grades2 = { 93, 85, 90, 98 };

		int total2 = 0;

		// Get the element from the array one by one, from the first to the last
		for (int num : grades2) {
			total2 += num;
		}

		System.out.println("The total of the array2 is -> " + total2);

	}

}
