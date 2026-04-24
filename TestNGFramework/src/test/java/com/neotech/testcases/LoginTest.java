package com.neotech.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {
	
	@Test(groups= {"smoke","regression"})
	public void validLogin() {

		LoginPageElements loginPage = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		// send username
		sendText(loginPage.username, ConfigsReader.getProperty("username"));

		// send password
		sendText(loginPage.password, ConfigsReader.getProperty("password"));

		// click on login button
		click(loginPage.loginButton);
		// Or use jsClick() or Actions.click()

		wait(5);

		// Verify the account name
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

		// Assertion
		Assert.assertEquals(actual, expected, "The account does NOT match!!!");
	}
	
	@Test(groups="smoke")
	public void emptyPassword()
	{
		LoginPageElements loginPage = new LoginPageElements();
		
		
		//send username
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		
		//leave the password empty
		
		
		click(loginPage.loginButton);
		
		//verify the proper message is displayed
		String expected = "Password cannot be empty";
		String actual = loginPage.passwordError.getText();
		
		//make assertion
		Assert.assertEquals(actual, expected, "The error message does NOT match!");
		
	}
	
	
	@Test(groups="regression")
	public void invalidPassword()
	{
		LoginPageElements loginPage = new LoginPageElements();
		
		//send the username
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		
		//send a wrong password
		sendText(loginPage.password, "testPassword");
		
		
		
		//click on login button
		click(loginPage.loginButton);
		
		
		//validate that invalid credentials message is shown
		String expected = "Invalid Credentials";
		String actual = loginPage.invalidPassword.getText();
		
		Assert.assertEquals(actual, expected, "Error message does NOT match!!!");
		
	}
	
}
