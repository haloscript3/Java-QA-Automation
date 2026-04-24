package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class AssertDemo extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate()
	{
		setUp();
	}
	
	@AfterMethod
	public void quitBrowser()
	{
		tearDown();
	}
	
	@Test
	public void titleValidation()
	{
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		//if I did this, then even if the test fails TestNG will mark it as PASSED and then print Test Failed!
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("Test Passed!");
		}
		else 
		{
			System.out.println("Test Failed!");
		}
		
		
		//1st way: 
	//	Assert.assertEquals(actualTitle, expectedTitle);
		
		//2nd way: 
		Assert.assertEquals(actualTitle, expectedTitle,"Titles did NOT match!!!");
		
		//would this run if the assertion fails?
		//No, the statements after the assertion will NOT run 
		System.out.println("Continue after assertion....");
	}
	
	@Test
	public void logoValidation()
	{
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
		boolean logoIsDisplayed = logo.isDisplayed();
		
		
		//lets fail this test intentionally
		logoIsDisplayed = false;
		
		//1st way
	//	Assert.assertEquals(logoIsDisplayed, true);
		
		//2nd way
	//	Assert.assertEquals(logoIsDisplayed, true, "Logo is NOT displayed");
		
		//3rd way
	//	Assert.assertTrue(logoIsDisplayed);
		
		//4th way
		Assert.assertTrue(logoIsDisplayed, "Logo is NOT displayed!");
		
	}
	
	
	
}
