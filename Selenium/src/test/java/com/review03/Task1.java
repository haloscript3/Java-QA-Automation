package com.review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		

		setUp();
		
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> it = allWindows.iterator();
		
		String mainWindow = it.next();
		String childWindow = it.next();
		
		
		//the set up with the iterator above is an assumption
		//it would be best done: 
				//- get the main handle before clicking on the second tab
				//- then use a for loop to assign the child window hanlde
		
		for (int i = 1; i <= 10; i++)
		{
			driver.switchTo().window(childWindow);
			System.out.println("Title: " + driver.getTitle());
			Thread.sleep(1000);
			
			driver.switchTo().window(mainWindow);
			System.out.println("Title: " + driver.getTitle());
			Thread.sleep(1000);
		}
		
		
		
		tearDown();
		
	}

}
