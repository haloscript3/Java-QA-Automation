package com.neotech.lesson25;

public class PhoneTest {

	public static void main(String[] args) {

		//an abstract class is an unfinished/unimplemented class
		
		//Can I create an object of an unfinished class??? NO!!!!
//		Phone p = new Phone(); //cannot instantiate the Phone class!!!!
	
		
		//upcasting
		Phone iphone = new iPhone();
		 
		iphone.call();   // overriding --> child method will execute (even though if I hover over the method it says Phone.call()
		iphone.text();  // inherited --> parent method will run (did not override)
		iphone.takePicture(); //implemented in the child class (even though if I hover over the method it says it will call the abstract Phone.takePicture()
		iphone.playMusic();  //implemented in the child class (even though if I hover over the method it says it will call the abstract Phone.playMusic() 

		
		
		
		Phone samsung = new Samsung();
		
		
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
		//can samsung call the googlePlay()?? 
		//No, it does not exist in the parent class
		//samsung.googlePlay();
		
	}

}
