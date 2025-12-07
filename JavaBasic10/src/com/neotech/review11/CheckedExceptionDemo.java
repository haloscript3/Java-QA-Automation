package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "/extra/democratic.party";
		System.out.println(filePath);

		// 2 ways to handle a checked exception
		// Like a Man -> surround with try/catch
		// Like a Woman -> throw the exception away

		try {
			FileInputStream fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Happy Ending!");

	}

}
