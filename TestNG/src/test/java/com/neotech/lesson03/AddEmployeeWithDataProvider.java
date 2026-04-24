package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class AddEmployeeWithDataProvider extends CommonMethods {

	@Test(dataProvider = "employees")
	public void addEmployee(String firstName, String lastName, String location) {
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

		wait(2);

		// click on the save button
		click(driver.findElement(By.id("modal-save-button")));

		// wait until you see the personal details tab
		waitForVisibility(By.id("personal_details_tab"));

		// validate employee is added
	}

	@DataProvider(name = "employees")
	public Object[][] getData() {

		Object[][] employees = { { "Ciara", "Flores", "Australian Regional HQ" },
				{ "Burak", "Busche", "Australian Regional HQ" }, { "Ozzy", "B.", "Australian Regional HQ" } };

		return employees;
	}

}
