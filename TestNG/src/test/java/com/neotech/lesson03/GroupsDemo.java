package com.neotech.lesson03;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsDemo {

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("this is before method in GroupsDemo");
	}

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Test1 in GroupsDemo");
	}

	@Test(groups = { "smoke", "regression", "sprint4" })
	public void test2() {
		System.out.println("Test2 in GroupsDemo");
	}

	@Test(groups = "sprint4")
	public void test3() {
		System.out.println("Test3 in GroupsDemo");
	}

	@Test(groups = { "smoke", "regression", "broken" })
	public void test4() {
		System.out.println("Test4 in GroupsDemo");
	}
}
