package com.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.BaseClass;

public class Homework1 extends BaseClass {
	/*	 
	1) Launch the browser and open the site "https://neotech.vercel.app/email"
	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
	3) On the Child Window, Enter your email ID and submit.
	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
	5) Close the Child window on which credentials are displayed.Switch to the parent window.
	6) Quit all browsers
	
	*/
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// locate and click on the Click Here link
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		// lets switch into the child window
		driver.switchTo().window(childWindow);

		// enter email in email box
		driver.findElement(By.id("emailid")).sendKeys("test@neo.com");

		Thread.sleep(2000);

		// click on the button
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(3000);

		// get the credentials
		String username = driver.findElement(By.id("username")).getText();
		String password = driver.findElement(By.id("password")).getText();

		System.out.println("Username is " + username);
		System.out.println("Password is " + password);

		// close the child window, switch back to the main window
		driver.close();

		Thread.sleep(3000);
		// driver.switchTo().window(parentWindow);

		tearDown();

	}

}
