package com.neotech.lesson01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void test1() {
		System.out.println("This is test method1");
	}

	@Test
	public void test2() {
		System.out.println("This is test method2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method runs before each test method");
		System.out.println("It is usually used for setup tasks");
		System.out.println("For example; opening the browser and going to the URL");
		System.out.println();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This method runs after each test method");
		System.out.println("It is usually used for cleanup tasks");
		System.out.println("For example; closing the browser and resetting variables");
		System.out.println();
	}

	@Test
	public void test3() {
		System.out.println("This is test method3");
		System.out.println("This a new test method");
		System.out.println("It can be used to test a new feature");
		System.out.println();
	}

	// WRONG:
	// BeforeMethod
	// Test1
	// Test2
	// Test3
	// AfterMethod

	// RIGHT:
	// BeforeMethod
	// Test1
	// AfterMethod

	// BeforeMethod
	// Test2
	// AfterMethod

	// BeforeMethod
	// Test3
	// AfterMethod

}
