package com.neotech.lesson26;

public class WebDriverTest {

	public static void main(String[] args) {

		ChromeDriver chrome = new ChromeDriver();
		chrome.openBrowser();
		chrome.maximizeWindow();
		chrome.findElement();
		chrome.takePicture();
		chrome.closeBrowser();

		FirefoxDriver firefox = new FirefoxDriver();
		firefox.openBrowser();
		firefox.maximizeWindow();
		firefox.findElement();
		firefox.takePicture();
		firefox.closeBrowser();

		// can we do this: YES
		WebDriver driver = new ChromeDriver(); // up-casting
		driver.openBrowser();
		driver.maximizeWindow();
		driver.findElement();
		// driver.takePicture();

		// how can the driver take pictures?
		Camera cam = (Camera) driver;
		cam.takePicture();
		// cam.closeBrowser();

		// will throw cast exception: ChromeDriver is not a FirefoxDriver
		FirefoxDriver fd = (FirefoxDriver) driver;
		fd.closeBrowser();

	}

}
