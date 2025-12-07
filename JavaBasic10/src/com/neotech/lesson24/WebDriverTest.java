package com.neotech.lesson24;

public class WebDriverTest {

	public static void main(String[] args) {

		WebDriver driver1 = new ChromeDriver(); // up-casting: treating child as parent(safe)
		driver1.openBrowser();

		ChromeDriver driver2 = (ChromeDriver) driver1; // down-casting: treating parent as child(risky)
		driver2.openBrowser();
		driver2.openFast();

		// what will happen here?
		// run time error: ClassCastException
//		WebDriver driver3 = new WebDriver();
//		FirefoxDriver driver4 = (FirefoxDriver) driver3;// down-casting
//		driver4.openBrowser();

	}

}
