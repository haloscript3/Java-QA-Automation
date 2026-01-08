package com.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class CalendarDemo extends BaseClass {
//https://www.delta.com/
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// click on the calendar icon
		driver.findElement(By.xpath("//div[@class='travelDateSelectionView']")).click();

		Thread.sleep(2000);

//		WebElement leftCalendarTable = driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//table"));
//		WebElement rightCelandarTable = driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-1']//table"));
//		
		// lets select Jan 4 for departure
		List<WebElement> leftCalendarTds = driver
				.findElements(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//table/tbody//td"));
		for (WebElement td : leftCalendarTds) {
			if (td.getText().equals("4")) {
				td.click();
				break;
			}
		}

		// lets select Feb 9 for arrival
		List<WebElement> rightCalendarTds = driver
				.findElements(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-1']//table/tbody//td"));
		for (WebElement td : rightCalendarTds) {
			if (td.getText().equals("9")) {
				td.click();
				break;
			}
		}

		Thread.sleep(3000);

		// click on Done button
		driver.findElement(By.xpath("//button[@value='done']")).click();

		Thread.sleep(3000);

		tearDown();

	}

}
