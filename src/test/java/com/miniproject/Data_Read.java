package com.miniproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read {
	
	public static void read_particular_data() throws IOException {
		
		File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\maven.miniproject\\user_data1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(2);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();//  enum
		
		if (cellType.equals(CellType.STRING)) { //--2(row)-0 (column)---check
			//CellType.string--->enum
			
			String stringCellValue = cell.getStringCellValue(); // cell la value irukum
			System.out.println(stringCellValue);
			
			
			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int CellValue = (int) numericCellValue;
			// for decimal(.0) varama iruka int la change panrom
			
			System.out.println(CellValue);
		}
	
	}
	
	public static void all_Data() throws Throwable {
		
		File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\maven.miniproject\\user_data1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				  CellType cellType = cell.getCellType();
				  
				  if (cellType.equals(CellType.STRING)) {
					
					  String cellValue = cell.getStringCellValue();
					  System.out.println(cellValue);
				}
				  else if (cellType.equals(CellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int value = (int) cellValue;
					System.out.println(value);
				}
				
				
			}
		
		}
		

	}
	
	public static void main(String[] args) throws Throwable {
		
		read_particular_data();
		all_Data();
		
	}

}
