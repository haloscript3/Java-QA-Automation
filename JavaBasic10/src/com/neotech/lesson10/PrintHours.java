package com.neotech.lesson10;

public class PrintHours {
	// Print the whole combination of hours in a digital clock
	// 00:00
	// 00:01
	// .....
	// 23:59
	public static void main(String[] args) {

		// parent loop: hours
		// child loop: minutes
		for (int hour = 0; hour <= 23; hour++) {

			// create the inner loop to keep track of minutes
			for (int min = 0; min <= 59; min++) {
				// print the hour in two digits format
				if (hour < 10) {
					System.out.print("0" + hour + ":"); // converts one digit numbers to two digits
				} else {
					System.out.print(hour + ":");
				}

				// print the min in two digits format
				if (min < 10) {
					System.out.println("0" + min);
				} else {
					System.out.println(min);
				}
			}
		}

	}

}
