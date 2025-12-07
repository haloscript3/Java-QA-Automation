package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {

		// 1) Locate the file
		String filePath = "C:\\Users\\msipc\\Documents\\GitHub\\neotech\\JavaBasicX\\configs\\example.properties";

		// 2) Create a channel to the file using FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		// 3) Create a Properties object
		Properties prop = new Properties();

		// 4) Load the data in the prop object
		prop.load(fis);

		System.out.println(prop);

		prop.setProperty("city", "NYC");
		prop.setProperty("state", "NY");
		prop.setProperty("year", "2025");

		// what will happen if the property name does not exist? ADD the new property
		prop.setProperty("phone", "555 214 5556");

		// now i need the FileOutputStream to write the prop into the file
		FileOutputStream fos = new FileOutputStream(filePath);

		// write changes to the file
		prop.store(fos, "we just updated our properties file");
	}

}
