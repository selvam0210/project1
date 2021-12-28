package com.miniproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Row_datadriven {
	
public static void row_data() throws IOException {
	
	File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\maven.miniproject\\user_data1.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet sheetAt = wb.getSheetAt(0);  // index starts from 0-1
	
	Row row = sheetAt.getRow(3);
	
	Cell cell = row.getCell(1);
	
	CellType cellType = cell.getCellType();
	
	if (cellType.equals(CellType.STRING)) {
		
		String stringCellValue = cell.getStringCellValue(); // cell la value iruku
		
		System.out.println(stringCellValue);
		
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		
		int value = (int) numericCellValue;
		System.out.println(numericCellValue);
		
		
	}
	
	
}	
	
	
	
	
	
	
	public static void main(String[] args) throws Throwable {
		
		row_data();
		
	}

}
