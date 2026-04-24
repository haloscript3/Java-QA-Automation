package com.neotech.lesson02;

import org.testng.annotations.Test;

public class DependsDemo {


	@Test
	public void firstMethod()
	{
		System.out.println("firstTest");
	}
	
	@Test
	public void secondMethod()
	{
		System.out.println("secondTest");
	}
	
	
	@Test(dependsOnMethods= {"firstMethod", "secondMethod"})
	public void thirdMethod() 
	{
		System.out.println("thirdTest");
		
		throw new RuntimeException(); //unchecked Exception
	}
	
	@Test(dependsOnMethods="thirdMethod")
	public void fourthMethod()
	{
		System.out.println("fourthTest");
	}
	
	
}
