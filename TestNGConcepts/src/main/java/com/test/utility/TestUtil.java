package com.test.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 30;

	public static String TESTDATA_SHEET_PATH = "E:\\eclipse-workspace\\RegistrationData.xlsx";

	static Workbook book;
	public static Sheet sheet;
	public static String s1, s2;
	public static int TRowNum;
	public static String[][] data;

	public static String[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
		String[][] data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println("Number of Rows in Sheet= " + sheet.getLastRowNum());
		System.out.println("Number of Columns in Sheet= " + sheet.getRow(0).getLastCellNum());
		TRowNum = sheet.getLastRowNum();

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {

				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				System.out.print(data[i][k]);
				System.out.print("||");

			}

			System.out.println("");

		}

		return data;
	}
	
	

}
