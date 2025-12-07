package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework {
	// Read Homework.xlsx file
	// Read Companies sheet

	// 1. Read the third row (row index 2) and create an ArrayList of String.
	// Then print the ArrayList.

	// 2. Read the fifth column (col index 4) and create an HashSet of Double.
	// Then print the HashSet.
	public static void main(String[] args) throws IOException {
		// 1) Locate the file
		String filePath = System.getProperty("user.dir") + "/test_data/Homework.xlsx";
		// System.out.println(filePath);

		// 2) Create a channel to the file using FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		// 3) Create a Workbook object
		Workbook book = new XSSFWorkbook(fis);

		// 4) Create a Sheet object
		Sheet sheet = book.getSheet("Companies");

		// 1. Read the third row (row index 2) and create an ArrayList of String.
		// Then print the ArrayList.
		// Create a Row object for the third row
		Row thirdRow = sheet.getRow(2);

		// number of cells in third row
		int cols = thirdRow.getLastCellNum();

		List<String> thirdRowItems = new ArrayList<>();

		// loop over the items of the third row
		for (int i = 0; i < cols; i++) {
			Cell cell = thirdRow.getCell(i);
			thirdRowItems.add(cell.toString());
		}

		System.out.println(thirdRowItems);

		// 2. Read the fifth column (col index 4) and create a HashSet of Double.
		// Then print the HashSet.
		Set<Double> accounts = new HashSet<>();
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);

		// loop over the rows of the sheet
		for (int i = 1; i < rows; i++) {
			Row row = sheet.getRow(i);
			Cell fifthCell = row.getCell(4);
			double fifthCellValue = fifthCell.getNumericCellValue();
			accounts.add(fifthCellValue);

			// accounts.add(sheet.getRow(i).getCell(4).getNumericCellValue());
		}

		System.out.println(accounts);

		book.close();
		fis.close();

	}

}
