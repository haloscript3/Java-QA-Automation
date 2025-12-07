package com.neotech.review08;

// In Java we don't allow multiple inheritance
// In Java we achieve multiple inheritance through interfaces :)
public class Walnut extends Fruit implements Crackable {

	public Walnut(String color) {
		super(color);
	}

	public void crack() {
		System.out.println("Cracking the " + color + " Walnut.");
	}

}
