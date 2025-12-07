package com.neotech.lesson24;

public class FinalKeyword {

	public static String str = "Hello";
	public static final String str2 = "Bye";

	public static void main(String[] args) {

		str = "Hi"; // re-assing is possible
		System.out.println(str);

		// str2 = "Chio"; // re-assign is NOT possible because of the final keyword

		final String str3 = "Java is fun!";
		// can i re-assign its value? NO
		// str3 = "something";
	}

	// can i override a final method: NO
	public final void hello() {
		System.out.println("hello");
	}

	// can i overload a final method: YES
	public final void hello(String str) {
		System.out.println("Hello " + str);
	}
}

class ChildFinalKeyword extends FinalKeyword {
	// final methods can not be overridden
//	public void hello() {
//		System.out.println("hello");
//	}

	// overloading a final method is allowed
	public final void hello(int i) {
		System.out.println("Hello " + i);
	}
}
