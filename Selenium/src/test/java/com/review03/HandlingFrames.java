package com.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		//How can we switch to a frame???
		
		
		
		// (1) index 
//		driver.switchTo().frame(0);
		
		// (2) name or Id
//		driver.switchTo().frame("age-frame");
		
		//(3) WebElement 
		
		WebElement iFrameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iFrameElement);
		

		//after switching to an iframe (going to another room), now we have access to its elements (but not the ones on the lobby)
		
		WebElement ageBox = driver.findElement(By.id("age"));
		
		ageBox.sendKeys("30");
		Thread.sleep(3000);
		
		ageBox.clear();
		Thread.sleep(3000);
		
		ageBox.sendKeys("50");
		Thread.sleep(3000);
		
		
		//before we interact with any other element in the outer page, we need to switch the driver's focus to it
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Nested iframes")).click();
		Thread.sleep(3000);
		
		
		//how can I get the text inside the child frame??? 
		
			// 1. go into the parent frame
			// 2. go into the child frame 
			// 3. get text
			// 4. we can switch to the default content 
		
		driver.switchTo().frame("parent-frame");
		driver.switchTo().frame("child-frame");
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		
		
		tearDown();

	}
}
