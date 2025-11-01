package com.neotech.lesson19;

public class StaticKeywordTest {

	public static void main(String[] args) {

		//I dont have an object yet, can I run this?
		//YES!!!
		//That is the reason why we cannot have any reference to instance elements.
		//Because we have not yet created an object, and we are calling this method.
		StaticKeyword.displaySpecificInfo_2();
		
		//Can I access this without creating an object??
		//YES!!
		StaticKeyword.touchscreen = true;
		
		// I am creating a local variable
		boolean touchscreen = false;
		
		touchscreen = true;

		
		StaticKeyword.brand = "iPhone";
		
		StaticKeyword.displaySpecificInfo_2();
		
		StaticKeyword iphone1 = new StaticKeyword();
		
		iphone1.color = "red";
		iphone1.memory = 128;
		
		iphone1.displaySpecificInfo();
		
		//I can call a static method from an object, but it is not the proper form 
		iphone1.displaySpecificInfo_2();
		
		//We refer to the static elements always by classname
		StaticKeyword.displaySpecificInfo_2();
		
		StaticKeyword iphone2 = new StaticKeyword();
		iphone2.color = "black";
		iphone2.memory = 512;
		
		//lets check the memory for each iphone
		System.out.println("iPhone1 memory: " + iphone1.memory);
		System.out.println("iPhone2 memory: " + iphone2.memory);
		
		//lets check the brand - not the proper way to access it. 
		System.out.println("iPhone1 brand: " + iphone1.brand);
		//if I change the brand: 
		iphone1.brand = "Samsung"; //NOT THE PROPER FORM!!!
		 // with this, even without the proper form, this would change the brand for all objects!!!
		System.out.println("iPhone2 brand: " + iphone2.brand);
		
		
		
	
	
	}

}
