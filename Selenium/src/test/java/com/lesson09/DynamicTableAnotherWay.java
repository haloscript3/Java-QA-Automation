package com.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;
import com.utils.ConfigsReader;

public class DynamicTableAnotherWay extends BaseClass {

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

		// get a list of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));

		String expected = "Linda";

		for (int i = 0; i < rows.size(); i++) {
			String nameCellXpath = "//table[@id='employeeListTable']/tbody/tr[" + (i + 1) + "]/td[3]";
			WebElement nameCell = driver.findElement(By.xpath(nameCellXpath));

			if (nameCell.getText().contains(expected)) {
				nameCell.click();
				break;
			}
		}

		Thread.sleep(10000);

		tearDown();

	}

}
