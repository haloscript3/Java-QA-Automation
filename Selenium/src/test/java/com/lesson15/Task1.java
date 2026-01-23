package com.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		
		//Go to https://neotech.vercel.app/keypress
		//Press TAB, ESC, ENTER
		
		setUp();
		
		WebElement searchBox = driver.findElement(By.id("target"));
		
		wait(2);
		searchBox.sendKeys(Keys.TAB);
		
		wait(2);
		searchBox.sendKeys(Keys.ESCAPE);
		
		wait(2);
		searchBox.sendKeys(Keys.ENTER);
		wait(2);
		
		//key chaining: 
		//searchBox.sendKeys(Keys.TAB.ESCAPE.ENTER);
		
		
		tearDown();

	}

}
