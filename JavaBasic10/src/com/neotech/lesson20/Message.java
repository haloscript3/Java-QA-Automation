package com.neotech.lesson20;

public class Message {

	Message() {
		System.out.println("I am the default constructor");
	}

	Message(String str) {
		System.out.println("I am the constructor with a string: " + str);
	}

	public static void main(String[] args) {

		Message m1 = new Message();

		Message m2 = new Message("Hello class!");
	}

}
