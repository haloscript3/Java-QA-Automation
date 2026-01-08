package com.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class Task1 extends BaseClass {
//  Go to https://www.facebook.com/r.php
//  Verify:
//  month dd has 12 month options
//  day dd has 31 day options
//  year dd has 121 year options
//  Select your date of birth	
//  Quit browser
	public static void main(String[] args) throws InterruptedException {

		setUp();

		Select month = new Select(driver.findElement(By.id("month")));
		Select day = new Select(driver.findElement(By.id("day")));
		Select year = new Select(driver.findElement(By.id("year")));

		System.out.println("Number of options in month dropdown: " + month.getOptions().size());
		System.out.println("Number of options in day dropdown: " + day.getOptions().size());
		System.out.println("Number of options in year dropdown: " + year.getOptions().size());

		// select your date of birth: Feb 2, 2000
		day.selectByIndex(1);
		Thread.sleep(2000);

		month.selectByVisibleText("Feb");
		Thread.sleep(2000);

		year.selectByValue("2000");
		Thread.sleep(2000);

		tearDown();

	}

}
