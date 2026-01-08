package com.review03;

import java.time.Duration;

import org.openqa.selenium.By;

import com.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		//we declare the implicit wait right after driver creation
		
		//this wait will be valid for the whole life of the driver 
		//it only applies to findElement/s calls 
		//it is active wait (so it will not wait the whole time for every element, but only as long as it shows)
		//if the element does not show, then we have a timeout...
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.id("btnStartDownload")).click();
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(2000);
		
		
		tearDown();

	}

}
