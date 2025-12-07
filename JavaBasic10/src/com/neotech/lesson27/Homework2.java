package com.neotech.lesson27;

interface WebDriver {
	void open();

	void close();

	String getTitle();
}

interface TakesScreenshot {
	void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	// interface extends interfaces
	// class implements interfaces
	// class extends class
	void nagivate();
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opened.");

	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed.");

	}

	@Override
	public String getTitle() {
		return "NeoTech";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Chrome took screenshot");

	}

	@Override
	public void nagivate() {
		System.out.println("Navigate on Chrome");

	}

}

class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Firefox driver opened.");

	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed.");

	}

	@Override
	public String getTitle() {
		return "NeoTech";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Firefox took screenshot");

	}

	@Override
	public void nagivate() {
		System.out.println("Navigate on Firefox");

	}

}

class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari driver opened.");

	}

	@Override
	public void close() {
		System.out.println("Safari driver closed.");

	}

	@Override
	public String getTitle() {
		return "NeoTech";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Safari took screenshot");

	}

	@Override
	public void nagivate() {
		System.out.println("Navigate on Safari");

	}

}

public class Homework2 {
	public static void main(String[] args) {
		// we can NOT instantiate an interface
		// RemoteWebDriver rwd = new RemoteWebDriver();

		RemoteWebDriver rwd = new ChromeDriver(); // upcasting
		WebDriver wd = new ChromeDriver(); // upcasting

		ChromeDriver c = (ChromeDriver) wd; // downcasting

		ChromeDriver cd = new ChromeDriver();
		FirefoxDriver fd = new FirefoxDriver();
		SafariDriver sd = new SafariDriver();

		RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
		remoteArray[0] = cd;
		remoteArray[1] = fd;
		remoteArray[2] = sd;

		for (RemoteWebDriver driver : remoteArray) {
			driver.open();
			driver.getScreenshot();
			System.out.println(driver.getTitle());
			driver.nagivate();
			driver.close();
			System.out.println("-----------");
		}

	}

}
