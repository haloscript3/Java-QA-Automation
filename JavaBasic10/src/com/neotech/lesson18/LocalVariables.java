package com.neotech.lesson18;

public class LocalVariables {

	void method1() {
		String name = "Brenda";
		int age = 27;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		LocalVariables lv = new LocalVariables();
		lv.method1();

		boolean flag = true;

		if (flag == true) {
			System.out.println("yes");
			System.out.println(flag);

			boolean flag2 = false;
		}

		System.out.println(flag);
		// System.out.println(flag2);

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// System.out.println(i);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i);
				System.out.println(j);
			}

			// System.out.println(j);
			System.out.println(i);
		}

		// System.out.println(i);

	}

}
