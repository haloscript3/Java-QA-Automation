package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		// to properly read the excel file, we will create a FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheetAt(0); // first sheet from the left

		// How can i get the number of rows?
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("The sheet has " + rows + " rows");

		// Lets get the number of columns in first row -> index 0
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("First row has " + cols + " columns");

		// Can i print every cell value in my sheet?
		// We need a nested for loop structure, loop over rows then columns
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(sheet.getRow(row).getCell(col).toString() + " | ");
			}

			System.out.println();
		}

		book.close();
		fis.close();
	}

}
