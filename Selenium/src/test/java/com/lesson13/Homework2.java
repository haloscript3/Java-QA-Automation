package com.lesson13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class Homework2 extends CommonMethods {
	/*
	Go to https://hrm.neotechacademy.com/
	Log in using our custom methods
	Go to PIM menu
	Add an employee
	Go to Employee List
	Get the list of the employees (Using tables - tr and td) 
	Loop to search for the employee you added
	When you find the employee - click on it.
	Take a screenshot
	 */
	public static void main(String[] args) {

		setUp();

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
		sendText(driver.findElement(By.id("first-name-box")), "John");
		sendText(driver.findElement(By.id("last-name-box")), "Doe");

		WebElement locationElement = driver.findElement(By.xpath("//div[text() = '-- Select --']"));
		click(locationElement);
		click(driver.findElement(By.linkText("France Regional HQ")));

		wait(2);

		String newEmployeeId = driver.findElement(By.id("employeeId")).getDomProperty("value");
		System.out.println(newEmployeeId);

		// click on the save button
		click(driver.findElement(By.id("modal-save-button")));

		// wait until you see the personal details tab
		waitForVisibility(By.id("personal_details_tab"));

		// click on Employee List
		click(driver.findElement(By.linkText("Employee List")));

		// loop over all employeId tds and find the one we just added and click on it
		List<WebElement> employeeIdTds = driver
				.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[2]"));

		for (WebElement td : employeeIdTds) {
			String tdText = td.getText();

			if (tdText.equals(newEmployeeId)) {
				click(td);
				break;
			}
		}

		// wait for personal details page to be visible: select an element within the
		// page such as first name box
		waitForVisibility(By.id("firstName"));

		// now we can take our screenshot
		takeScreenshot("HRM_EmployeeDetails.png");

		tearDown();

	}

}
