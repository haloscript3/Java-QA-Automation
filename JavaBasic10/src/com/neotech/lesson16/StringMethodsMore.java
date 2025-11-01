package com.neotech.lesson16;

public class StringMethodsMore {

	public static void main(String[] args) {

		//.charAt()
		String name = "Shekinah";
		
		char letter = name.charAt(0);
		System.out.println("Letter is: " + letter);
	
		//-----------------------------------

		//.indexOf()
		
		//What if I want to do the opposite??? 
		//I want to get the index of a letter on the string??
		int index = name.indexOf('h');
		System.out.println("The index of letter h is: " + index);
		
		//.lastIndexOf()
		//what if I wanted to find the last occurrence of 'h'
		System.out.println("The last index of letter h is: " + name.lastIndexOf('h'));
		
		
		//we could check the index of a substring too
		System.out.println("The index of na is: " + name.indexOf("na"));
		
		//-----------------------------------
		
		//.substring()
		
		String message = "Today was an awesome class!";
		
		//this method takes only 1 parameter - beginning index
		//it starts cutting the string at the beginning index all the way to the end
		String substr = message.substring(5);
		System.out.println(substr);
		
		//this method will get the substring starting at index 6 until index 9-1 
		//[6, 9[
		String substr2 = message.substring(6, 9);
		System.out.println(substr2);
		
		String substr3 = message.substring(13);
		System.out.println(substr3.toUpperCase());
		
	}

}
