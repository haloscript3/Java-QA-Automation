package com.neotech.lesson25;

public abstract class Phone {

	public void call()
	{
		System.out.println("Phones can make calls!");
	}
	
	
	public void text()
	{
		System.out.println("Phones can send texts!");
	}
	
	//unimplemented methods (abstract methods)
	public abstract void takePicture();
	
	public abstract void playMusic();
	
}

class iPhone extends Phone
{
		//Since this is not an abstract class, and I am extending an abstract class, 
			// then I HAVE to implement the unimplemented methods of the parent class 

	@Override
	public void takePicture() {
		System.out.println("iPhones take good photos!");
		
	}

	@Override
	public void playMusic() {
		System.out.println("iPhones can play music!");
	}
	
	
	public void call()
	{
		System.out.println("iPhones can also have FaceTime calls!");
	}
	
}


class Samsung extends Phone
{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes best photos!");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung can play music too!");
	}
	
	public void googlePlay()
	{
		System.out.println("Samsung has google play!");
	}
	
}