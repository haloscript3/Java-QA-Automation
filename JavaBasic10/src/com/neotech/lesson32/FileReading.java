package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {

		// get the file path:
		String filePath = "C:\\Users\\msipc\\Documents\\GitHub\\neotech\\JavaBasicX\\configs\\config.properties";

		// the problem with this file path is: it only exists in my pc

		// this will return the location of the project root
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);

		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));

		String dynamicPath = userDirectory + "/configs/config.properties";
		System.out.println(dynamicPath);

		FileInputStream fis = new FileInputStream(dynamicPath);

		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop);
	}

}
