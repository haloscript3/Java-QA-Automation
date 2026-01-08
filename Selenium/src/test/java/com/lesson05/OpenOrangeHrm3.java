package com.lesson05;

import com.utils.BaseClass;

public class OpenOrangeHrm3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// open the browser, go to the url (both browser and url is set in
		// configuration.properties)
		setUp();

		// write your test code here
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);

		// close the browser
		tearDown();

	}

}
