package com.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class CalendarHandling extends BaseClass {
	// Go to this link: https://jqueryui.com/
	// Click on Datepicker from the left menu
	// Show the Calendar
	// Select 09/25/2026 from the Calendar
	// Verify that you have selected 09/25/2026

	public static void main(String[] args) throws InterruptedException {
		setUp();

		WebElement link = driver.findElement(By.linkText("Datepicker"));
		link.click();

		Thread.sleep(1000);

		// I am not able to locate the element, because it is inside a Frame
		// driver.findElement(By.id("datepicker"));

		// Switching to the FRAME
		// driver.switchTo().frame(0);

		// Not possible, because the frame does not have a NAME or ID
		// driver.switchTo().frame(nameOrId);

		WebElement fr = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(fr);

		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		dateTextBox.click();

		String expectedMonthYear = "September 2026";

		// Iterate until "September 2026"
		while (true) {

			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthYearText = monthYear.getText();

			if (monthYearText.equals(expectedMonthYear)) {
				break;
			}

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(100);
		}

		Thread.sleep(1000);

		// Now we need to click on the correct date
		String expectedDay = "25";

		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		// Iterate all the days until I find the 25th and then click on it
		for (WebElement day : days) {
			if (day.getText().equals(expectedDay)) {
				// I found the correct day
				day.click();
				break;
			}
		}

		// Let's verify that we selected the correct date -> 09/25/2026
		String expectedDate = "09/25/2026";

		// Getting the text from the textBox
		String actualText = dateTextBox.getAttribute("value");
		String actualText2 = dateTextBox.getDomProperty("value");

		if (actualText.equals(expectedDate)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}

		Thread.sleep(2000);

		tearDown();
	}

}
