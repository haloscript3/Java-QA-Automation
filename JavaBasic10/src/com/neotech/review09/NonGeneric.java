package com.neotech.review09;

import java.util.ArrayList;

public class NonGeneric {

	public static void main(String[] args) {

		// This is same as Non-Generic
		// ArrayList<Object> arrList = new ArrayList<String>();

		ArrayList europe = new ArrayList<>(); // Non-Generic
		europe.add("Italy");
		europe.add(50);
		europe.add('%');
		europe.add(true);

		for (Object element : europe) {
			System.out.println(element);
		}

	}

}
