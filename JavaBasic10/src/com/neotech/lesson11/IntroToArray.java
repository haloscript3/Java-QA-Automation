package com.neotech.lesson11;

public class IntroToArray {

	public static void main(String[] args) {
		

		
		int num = 10; //one variable, points to one value

		int[] array1 = new int[5];


		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);

		
		array1[0] = 5; //array1 = [5, 0, 0, 0, 0]
		array1[1] = 10;//array1 = [5, 10, 0, 0, 0]
		array1[3] = 20;//array1 = [5, 10, 0, 20, 0]
		array1[4] = 25;//array1 = [5, 10, 0, 20, 25]
		array1[2] = 15;//array1 = [5, 10, 15, 20, 25]
		
		
		System.out.println("After element assignment");
		System.out.println(array1[0]); 
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		
		
		//another way to declare the array
		int[] array2;
		
		//when I want to initialize it
		array2 = new int[3];
		
		array2[2] = 8; 
		array2[1] = 4;
		array2[0] = array2[1] + array2[2];
		
		System.out.println("array2[0]: "  + array2[0]);
		
		
		
		//another structure -- less preferred
		String strArray[] = new String[2];
		strArray[0] = "NYC";
		strArray[1] = "Newark";
	//	strArray[2] = "Hoboken"; //we can't store anything here, OutOfBounds
		strArray[1] = "Bronx"; //re-assigning a string value to the second element 
								//element at index 1
		
		
		char[] letters = new char[6];
		
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'Y';
		letters[5] = 'Z';
		
		
		System.out.println("The letter at index 4 is: " + letters[4]);
		
	}

}
