package com.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;
import com.utils.ConfigsReader;

public class DynamicTable extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		// login to the application
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		// click on the login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// click on the PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		// click on Employee List link
		driver.findElement(By.linkText("Employee List")).click();

		Thread.sleep(5000);

		List<WebElement> tds = driver.findElements(By.xpath("//table[@id='employeeListTable']//td"));

		for (WebElement td : tds) {
			if (td.getText().contains("Linda")) {
				td.click();
				break;
			}
		}

		Thread.sleep(10000);

		tearDown();

	}

}
