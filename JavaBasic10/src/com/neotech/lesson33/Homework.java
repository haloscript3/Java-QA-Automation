package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Homework {
	/*
	 * Create a PROPERTY file to store following configurations: 
	 * browser= 
	 * url=
	 * username= 
	 * password=
	 */
	public static void main(String[] args) throws IOException {

		// 1) Locate the file
		// String filePath =
		// "C:\\Users\\msipc\\Documents\\GitHub\\neotech\\JavaBasicX\\configs\\homework.txt";
		// Using the full path is not a good practice
		// Because, this wont work for other people sharing the project

		// Instead, we can use a dynamic location of the file:
		// a. get the current project directory
		// b. add the file location to it
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath = projectPath + "/configs/homework.txt";
		System.out.println(filePath);

		// 2) Create a FileInputStream object
		// We are creating this object to read the contents of the file
		FileInputStream fis = new FileInputStream(filePath);

		// 3) Create a Properties object
		Properties prop = new Properties();

		// 4) Load the properties object
		prop.load(fis);

		System.out.println(prop);

		// prop is a map object in its core so we may use key/value pairs to access it
		String browser = prop.getProperty("browser");
		System.out.println(browser);

		Set<Object> keys = prop.keySet();
		System.out.println(keys);

		// lets loop over the keys
		for (Object key : keys) {
			System.out.println(key + " --> " + prop.get(key));
		}

		// Selenium steps
		System.out.println("Selenium steps:");
		System.out.println("I am opening the " + prop.getProperty("browser") + " browser");
		System.out.println("I go to this url: " + prop.getProperty("url"));
		System.out.println("I enter the username: " + prop.getProperty("username"));
		System.out.println("I enter the password: " + prop.getProperty("password"));

		// Lets add a new property to our prop object
		prop.setProperty("phone_number", "555 333 4444");

		// I need a FileOutputStream object to write the new property
		FileOutputStream fos = new FileOutputStream(filePath);

		// write to the file
		prop.store(fos, "Added the phone_number key");

		System.out.println(prop);

	}

}
