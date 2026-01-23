package com.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class JavaScriptExecutorDemo extends CommonMethods {
	// https://hrm.neotechacademy.com
	public static void main(String[] args) {
		setUp();

		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));

		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.backgroundColor='blue'", username);
		js.executeScript("arguments[0].style.backgroundColor='red'", password);

		// combine two statements into one
		js.executeScript("arguments[0].style.backgroundColor='blue';arguments[1].style.backgroundColor='red'", username,
				password);

		wait(5);

		WebElement submitButton = driver.findElement(By.xpath("//button"));

		js.executeScript("arguments[0].click();", submitButton);

		// go to pim
		click(driver.findElement(By.id("menu_pim_viewPimModule")));

		// go to employee list
		click(driver.findElement(By.linkText("Employee List")));

		wait(5);

		// scroll down vertically
		js.executeScript("window.scrollBy(0, 1500);");

		wait(3);

		// lets scroll up
		js.executeScript("window.scrollBy(0, -500);");

		wait(3);

		// lets scroll up or down until a certain element is visible
		WebElement user = driver.findElement(By.id("user-dropdown"));

		js.executeScript("arguments[0].scrollIntoView(true)", user);

		wait(5);

		tearDown();

	}

}
