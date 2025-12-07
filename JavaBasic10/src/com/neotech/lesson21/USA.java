package com.neotech.lesson21;

public class USA {

	// instance variables
	String state, stateCapital;

	USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}

	public void displayState() {
		System.out.println(this.state);
	}

	public void displayStateCapital() {
		System.out.println(this.stateCapital);
	}

	static void displayInfo() {
		System.out.println("This class has two instance variables: State and StateCapital");
	}

	public void displayInfo2() {
		this.displayState();
		displayStateCapital();
	}

	public static void main(String[] args) {

		USA us1 = new USA("Ohio", "Columbus");

		us1.displayState();
		us1.displayStateCapital();

		us1.displayInfo2();

		displayInfo();

		// displayInfo2();
	}

}
