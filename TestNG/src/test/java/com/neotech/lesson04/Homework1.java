package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

public class Homework1 extends CommonMethods {
	/*
	 
	Open chrome browser
	Go to "https://hrm.neotechacademy.com/"
	Login to the application
	Add 3 different Employees and Create Login Details by providing:
	First Name
	Last Name
	Username
	Password
	Verify Employee has been added successfully and take screenshot (you must have 3 different screenshots)
	Close the browser
	Specify a group for this test case, add it into specific suite and execute from the xml file.
	
	
	*/
	@Test(dataProvider = "excelData", groups = { "homework", "smoke" })
	public void addEmployee(String firstName, String lastName, String location, String username, String password) {
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		// expand the PIM menu
		click(driver.findElement(By.id("menu_pim_viewPimModule")));

		// click on Add Employee link
		click(driver.findElement(By.linkText("Add Employee")));

		// there are some waiting here
		// so i will wait until the modal is loaded and the first name box is visible
		waitForVisibility(By.id("first-name-box"));

		// fill in the employee details
		sendText(driver.findElement(By.id("first-name-box")), firstName);
		sendText(driver.findElement(By.id("last-name-box")), lastName);

		WebElement locationElement = driver.findElement(By.xpath("//div[text() = '-- Select --']"));
		click(locationElement);
		click(driver.findElement(By.linkText(location)));

		// click on credentials switch
		click(driver.findElement(By.xpath("//div[@class='custom-control custom-switch']")));

		// enter username/password & confirm password
		sendText(driver.findElement(By.id("username")), username);
		sendText(driver.findElement(By.id("password")), password);
		sendText(driver.findElement(By.id("confirmPassword")), password);

		wait(2);

		// click on the save button
		click(driver.findElement(By.id("modal-save-button")));

		// wait until you see the personal details tab
		waitForVisibility(By.id("personal_details_tab"));

		wait(2);

		// take screenshot
		takeScreenshot(username + ".png");

	}

	@DataProvider(name = "employees")
	public Object[][] getData() {

		Object[][] employees = { { "Ciara", "Flores", "Australian Regional HQ", "c.flores", "ciara@123" },
				{ "Burak", "Busche", "Australian Regional HQ", "b.busche", "burak@123" },
				{ "Ozzy", "B.", "Australian Regional HQ", "ozzy.b", "ozzy@123" } };

		return employees;
	}

	@DataProvider(name = "excelData")
	public Object[][] getExcelData() {
		String filePath = System.getProperty("user.dir") + "/testdata/Excel.xlsx";
		String sheetName = "Employee";

		return ExcelUtility.excelIntoArray(filePath, sheetName);
	}

}
