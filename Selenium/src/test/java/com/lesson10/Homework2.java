package com.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class Homework2 extends BaseClass {
	/*
	 
	=================   Lesson 09 HW 2 =================================
	TC: Delete Orders
	
	1) Open chrome browser
	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
	3) Login to the application
	4) Click on the checkbox of all orders with product FamilyAlbum
	5) Delete Selected orders
	6) Verify the orders have been deleted
	7) Quit the browser
	
	*/
	public static void main(String[] args) throws InterruptedException {

		setUp();
		// login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		// click on the checkboxes whose product is FamilyAlbum
		List<WebElement> productColumn = driver
				.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[3]"));

		// loop over the items of product column and compare with FamilyAlbum
		for (int i = 1; i < productColumn.size(); i++) {
			String text = productColumn.get(i).getText();

			if (text.equals("FamilyAlbum")) {

				// locate the checkbox
				String xpathForCheckBox = "//table[@id='ctl00_MainContent_orderGrid']//tr[" + (i + 2) + "]/td[1]/input";
				System.out.println("checkbox path: " + xpathForCheckBox);

				driver.findElement(By.xpath(xpathForCheckBox)).click();

				Thread.sleep(2000);
			}
		}

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

		Thread.sleep(4000);

		tearDown();

	}

}
