package com.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;
import com.utils.ConfigsReader;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {


		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		// click on PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Employee List")).click();

		Thread.sleep(5000);

		// click on the first employee
		driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody/tr[1]/td[1]")).click();

		Thread.sleep(5000);

		List<WebElement> dateIcons = driver
				.findElements(By.xpath("//i[@class='material-icons action-icon date-picker-open-icon']"));
		WebElement dateOfBirthIcon = dateIcons.get(0);
		dateOfBirthIcon.click();

		// select the month: February
		// find the li which has text February and click on it
		WebElement monthToggle = driver.findElement(By.cssSelector("div.select-wrapper.picker__select--month"));
		monthToggle.click();
		Thread.sleep(300); // give the picker time to open

		List<WebElement> months = driver
				.findElements(By.xpath("//div[@class='select-wrapper picker__select--month']//li"));
		for (WebElement month : months) {
			if (month.getText().equals("February")) {
				month.click();
				break;
			}
		}

		WebElement yearToggle = driver.findElement(By.cssSelector("div.select-wrapper.picker__select--year"));
		yearToggle.click();
		Thread.sleep(300); // give the picker time to open

		// select the year 1990
		List<WebElement> years = driver
				.findElements(By.xpath("//div[@class='select-wrapper picker__select--year']//li"));
		for (WebElement year : years) {
			if (year.getText().equals("1990")) {
				year.click();
				break;
			}
		}

		Thread.sleep(2000);

		// select day
		List<WebElement> days = driver
				.findElements(By.xpath("//table[@class='picker__table']//td"));
		for (WebElement day : days) {
			System.out.println(day.getText());
			if (day.getText().equals("14")) {
				day.click();
				break;
			}
		}

		Thread.sleep(5000);

		tearDown();
	}

}
