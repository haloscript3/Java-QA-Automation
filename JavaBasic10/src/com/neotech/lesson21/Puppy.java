package com.neotech.lesson21;

public class Puppy extends Dog {

	// If we consider Puppy the child:
	// Dog is the parent, Animal is the grandparent
	// Animal -> Dog -> Puppy

	public boolean hasTrainer;

	public void play() {
		System.out.println("This puppy loves to play!");
	}

}
