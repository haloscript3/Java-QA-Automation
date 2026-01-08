package com.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class Homework2_alternative extends BaseClass {
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

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr"));

		for (int i = 1; i < rows.size(); i++) {

			String rowText = rows.get(i).getText();

			if (rowText.contains("FamilyAlbum")) {
				// find FamilyAlbum row
				WebElement familyAlbumRow = rows.get(i);
				// find row's check-box
				WebElement rowsCheckBox = familyAlbumRow.findElement(By.cssSelector("input[type = 'checkbox']"));

				rowsCheckBox.click();
				Thread.sleep(3000);
			}
		}

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

		Thread.sleep(4000);

		tearDown();

	}

}
