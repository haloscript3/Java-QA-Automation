package com.neotech.lesson19;

public class Task1 {

	/*
	Create a method that will accept an array as parameter and will return a sum of 
	all elements from that array. Method should be visible only within the same package 
	and accessible by creating an instance of the class.
    Call this method from inside the class and another class in the same package.
	 
	 */

	
	//what are the method details: 
		// return type: (sum of all elements) --> int 
		// params: int[]
		// method name: sumOfArray
		// visibility: only within the same package --> default
		// accessible through an object: instance method (non-static) 
	
	int sumOfArray(int[] arr)
	{
		// the process: sum of all elements in the input array
		
		//my input is the array [1, 4, 8]
		//1. I need an empty container to add all those numbers on
		int sum = 0; //local variable, will only live on this method
		
		
		//2. I need to go through every element (LOOP) and add it to the sum
		for (int el : arr)  // for (int i = 0; i < arr.length; i++)
		{
			sum += el; // sum = sum + el
		}
		
		//could we use another loop? Sure, most of the time we can. It just might be less fitting. 
		/*
		int i = 0;
		
		while(i < arr.length)
		{
			sum += arr[i];
			i++;
		}
		*/

		return sum;
	}
	
	public static void main(String[] args) {
		
		Task1 obj = new Task1();
		
		int[] array = {55, 34, 87, 90, 43};
		
		int sum = obj.sumOfArray(array);
		System.out.println("The total sum of the array elements is: " + sum);
	}
}
