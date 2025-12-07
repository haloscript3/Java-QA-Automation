package com.neotech.lesson23;

public class DegreeTest {

	public static void main(String[] args) {

		Degree d = new Degree();
		d.getPrerequisite();

		System.out.println("-----------");

		Bachelors b = new Bachelors();
		b.getPrerequisite();

		System.out.println("-----------");

		Masters m = new Masters();
		m.getPrerequisite();

	}

}
