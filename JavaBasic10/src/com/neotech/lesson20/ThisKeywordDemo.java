package com.neotech.lesson20;

public class ThisKeywordDemo {

	public static void main(String[] args) {

		ThisKeyword obj1 = new ThisKeyword();
		obj1.sum(10, 45);

		System.out.println("-------------");

		ThisKeyword obj2 = new ThisKeyword(3, 9);
		obj2.sum(10, 20);

		System.out.println("-------------");

		ThisKeyword obj3 = new ThisKeyword();
		obj3.a = 11;
		obj3.b = 12;
		obj3.sum(1, 2);

		obj3.a = 3;
		obj3.b = 4;
		obj3.sum(1, 2);

	}

}
