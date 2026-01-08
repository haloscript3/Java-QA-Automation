package com.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class Homework1 extends BaseClass {
	/*
	 
	 ==================  Lesson 09 HW 1 =======================
	TC: Update Customer Information
	
	1) Open chrome browser
	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
	3) Login to the application
	4) Verify customer "Susan McLaren" is present in the table
	5) Click on customer details
	6) Update customers last name and credit card info
	7) Verify updated customers name and credit card number is displayed in table
	8) Close browser
	 
	 */
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		// Verify Susan McLaren is in table

		// 1st way:
		// locate the table, get its text, and check if text contains Susan McLaren

		String tableContent = driver.findElement(By.id("ctl00_MainContent_orderGrid")).getText();
		System.out.println(tableContent.contains("Susan McLaren"));
		System.out.println(tableContent);

		// this way, we can not click on Susan's details
		// So we have to locate the row that holds Susan and click on it

		// 2nd way:
		// find the row that holds Susan, then click on the edit button in that row

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr"));

		int susansRowNumber = 0;
		for (int i = 1; i < rows.size(); i++) {

			String rowText = rows.get(i).getText();

			if (rowText.contains("Susan McLaren")) {
				susansRowNumber = i;
				// find Susan's row
				WebElement susansRow = rows.get(i);
				// find Susan's edit button
				WebElement susansEditButton = susansRow.findElement(By.cssSelector("input[alt = 'Edit']"));
				// WebElement susansEditButton =
				// susansRow.findElement(By.cssSelector("input[type = 'image']"));

				susansEditButton.click();
				Thread.sleep(3000);
				break;
			}
		}

		Thread.sleep(3000);

		// locate the customer name element
		WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		String currentName = customerName.getText();
		System.out.println("Customers name: " + currentName);

		// update its value
		customerName.clear();
		Thread.sleep(2000);
		customerName.sendKeys("Susan Doe");

		// locate the card number element and update its value
		WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		cardNumber.clear();
		cardNumber.sendKeys("1111333344445555");

		Thread.sleep(3000);

		// click on the update button

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();

		Thread.sleep(4000);

		// verify the updated info
		WebElement susansRow = rows.get(susansRowNumber);
		System.out.println(susansRow.getText());

		tearDown();

	}

}
