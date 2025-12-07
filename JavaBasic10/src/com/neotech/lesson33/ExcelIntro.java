package com.neotech.lesson33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {

		// Locate the excel file
		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		// Excel file orientation in POI:
		// 1) File -> locate the file path(we just did above)
		// 2) Workbook -> content of the file as a whole (may have on or more sheets)
		// 3) Sheet -> composed of row-column matrix
		// 4) Row -> horizontal items
		// 5) Cell -> single entry in a row

		// Create a workbook object
		Workbook book = new XSSFWorkbook(filePath);

		// Create a sheet object
		Sheet testData = book.getSheet("TestData");

		// Create a row object for the needed row
		Row firstRow = testData.getRow(0);

		// Create a cell object for the needed data
		Cell firstCell = firstRow.getCell(0);

		// Get the contents of the cell
		String firstCellInfo = firstCell.toString();
		System.out.println(firstCellInfo);

		// How can i get NY: row 2, column 3
		Row rowNY = testData.getRow(2);
		Cell cellNY = rowNY.getCell(3);
		System.out.println(cellNY.toString());

		// Lets get Garfield using method chaining
		String cellGarfield = testData.getRow(1).getCell(2).toString();
		System.out.println(cellGarfield);

		// If we cant to show the zip number from the first row
		// By default the numeric value is returned as double
		double zipNumber = testData.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(zipNumber);

		// We can convert the double into int
		int fixedZipNumber = (int) zipNumber;
		System.out.println(fixedZipNumber);
	}

}
