package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {

		String str = "Hello";
		String str2 = new String("Hello"); // instantiating

		// lets create a mutable object
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);

		// we use string buffer when we expect frequent changes!
		sb.append(" there");
		System.out.println(sb);
		System.out.println(sb.length());

		// reverses and sets the value
		System.out.println(sb.reverse());
		// reverses back and sets the value
		System.out.println(sb.reverse());

		String str3 = sb.substring(2, 5);
		System.out.println(str3);
	}

}
