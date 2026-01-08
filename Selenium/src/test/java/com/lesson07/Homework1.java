package com.lesson07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class Homework1 extends BaseClass {
	/*
	Amazon Department List Verification
	Open chrome browser
	Go to "http://amazon.com/"
	Verify how many department options available.
	Print each department 
	Select Computers
	Quit browser
	 
	*/
	public static void main(String[] args) throws InterruptedException {

		setUp();

		Thread.sleep(3000);

		WebElement department = driver.findElement(By.id("searchDropdownBox"));
		Select departmentDd = new Select(department);

		List<WebElement> options = departmentDd.getOptions();

		System.out.println("There are " + options.size() + " departments!");

		for (WebElement option : options) {
			System.out.println(option.getText());
		}

		// select Computers
		departmentDd.selectByValue("search-alias=computers");

		Thread.sleep(4000);

		tearDown();

	}

}
