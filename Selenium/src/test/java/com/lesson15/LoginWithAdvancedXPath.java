package com.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class LoginWithAdvancedXPath extends CommonMethods {

	public static void main(String[] args) {

		// https://hrm.neotechacademy.com/

		setUp();
		
		WebElement username = driver.findElement(By.xpath("//div[@class='input-field'][1]/input"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password = driver.findElement(By.xpath("//div[@class='input-field'][1]/following-sibling::div[1]/input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		wait(2);
		
		WebElement submitBtn = driver.findElement(By.xpath("//img[@class='icon login-icon']/.."));
		
		
		click(submitBtn);
		wait(2);
		tearDown();
	}

}
