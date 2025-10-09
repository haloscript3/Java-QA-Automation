package com.neotech.lesson11;

import java.util.Arrays;

public class PrintArrays {

	public static void main(String[] args) {

		int[] points = {95, 90, 80, 85, 75, 100, 72};

		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		System.out.println(points[4]);
		System.out.println(points[5]);
		System.out.println(points[6]);
		
		int size = points.length;
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(points[i] + " ");
		}

		System.out.println();
		System.out.println("==============================");

		int sum = 0; 
		
		for (int i = 0; i < size; i++)
		{
			sum += points[i];
		
		}
		System.out.println("The total sum is: "+ sum);
		System.out.println("The average is: " + sum/size);
		System.out.println("The average is: " + (double) sum/size);
		System.out.println(Arrays.toString(points));
	}

}
