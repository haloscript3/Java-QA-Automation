package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {

		// To read from a file:
		// 1) Locate the file
		String filePath = "C:\\Users\\msipc\\Documents\\GitHub\\neotech\\JavaBasicX\\configs\\example.properties";

		// 2) Read the file using FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		// 3) This step depends on the type of file we are reading
		// In our case it is a properties file
		Properties prop = new Properties();

		// load the data
		prop.load(fis);

		String name = prop.getProperty("name");
		System.out.println("Name --> " + name);

		// property names are case sensitive
		String lastName = prop.getProperty("lastName");
		System.out.println("Last name --> " + lastName);

		Set<Object> keys = prop.keySet();
		System.out.println(keys);

		Collection<Object> values = prop.values();
		System.out.println(values);
	}

}
