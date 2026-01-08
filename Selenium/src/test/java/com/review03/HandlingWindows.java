package com.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.utils.BaseClass;

public class HandlingWindows extends BaseClass{

		//https://neotech.vercel.app/windows
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		String mainWindow = driver.getWindowHandle();
		
		System.out.println(mainWindow);
		
		//chrome: 682CCBD746DCF2C130969FC0215ED924
		//firefox: 402906e7-677f-46da-a8b6-4e99bcdd7b25

		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
		//Once I open the new tab, I would want to start interacting with the elements there. 
		//The problem is that the driver focus is still on the first page we opened. 
		
		
		//how can I move the focus to the new page?? 
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String windowId : allHandles)
		{
			//if the windowId is not my mainWindow, then switch to it
			if (!windowId.equals(mainWindow))
			{
				driver.switchTo().window(windowId);
				break;
			}
		}
		
		//after this loop, I am now on the new tab. So, I can start interacting with the elements there
		
		driver.findElement(By.name("q")).sendKeys("NeoTech Academy");
		Thread.sleep(3000);
		
		
		
		tearDown();


	}

}
