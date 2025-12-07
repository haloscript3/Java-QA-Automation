package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {

		String filePath = System.getProperty("user.dir") + "/configs/config.properties";

		try {

			FileInputStream fis = new FileInputStream(filePath);

			Properties prop = new Properties();

			prop.load(fis);
			System.out.println(prop);

			fis.close();
			throw (new Exception());

		}

		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Check the file path and try again!");
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Can not load the properties file");
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("End of code");

	}

}
