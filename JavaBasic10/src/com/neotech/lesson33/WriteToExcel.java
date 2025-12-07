package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		// to properly read the excel file, we will create a FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("TestData");

		// add a new column called Country
		sheet.getRow(0).createCell(5).setCellValue("Country");

		// lets add a new row
		sheet.createRow(3).createCell(0).setCellValue("Esmeralda");
		sheet.getRow(3).createCell(1).setCellValue("Musha");

		// can i add a new sheet? YES
		book.createSheet("Ozzy");

		// lets apply the changes to excel file
		FileOutputStream fos = new FileOutputStream(filePath);
		book.write(fos);

		// close objects to release resources
		book.close();
		fis.close();
		fos.close();
	}

}
