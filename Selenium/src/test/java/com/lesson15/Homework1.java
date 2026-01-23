package com.lesson15;

import com.pages.LoginPageUsingPageFactory;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class Homework1 extends CommonMethods {
 
	
	public static void main(String[] args)  {
		
		
		/*
		 	TC 1: Orange HRM blank password validation
			1. Go to https://hrm.neotechacademy.com/
			2. Enter valid username and leave password field empty
			3. Click on login button
			4. Verify error message with text "Password cannot be empty" is displayed
		 */
		
		
		setUp();
		
		LoginPageUsingPageFactory loginPage = new LoginPageUsingPageFactory();
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		
		wait(2);
		
		click(loginPage.loginBtn);
		
		wait(2);
		
		
		String expectedMessage = "Password cannot be empty";
		String actualMessage = loginPage.passwordError.getText();
		
		if (expectedMessage.equals(actualMessage))
		{
			System.out.println("Test Passed!!!");
		}
		else 
		{
			System.out.println("Test Failed!!!");
		}
		
		
		tearDown();
	}
}
