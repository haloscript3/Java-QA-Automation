package com.test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		LoginPage loginPage = new LoginPage();

		// enter the username
		sendText(loginPage.username, ConfigsReader.getProperty("username"));

		// enter the password
		sendText(loginPage.password, ConfigsReader.getProperty("password"));

		// click on the login button
		click(loginPage.loginBtn);

		// loginPage.loginBtn.click();

		wait(5);

		// verify the logo is displayed
		DashboardPage dashboard = new DashboardPage();

		if (dashboard.logo.isDisplayed()) {
			System.out.println("test passed!");
		} else {
			System.out.println("test failed!!!");
		}

		// verify the user is Jacqueline White
		String expectedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();

		if (actualName.equals(expectedName)) {
			System.out.println(expectedName + " logged in");
		} else {
			System.out.println(expectedName + " did NOT log in!");
		}

		wait(3);

		tearDown();

	}

}
