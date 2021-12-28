package com.miniproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
public static void main(String[] args) throws Throwable {
	File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\maven.miniproject\\DataDriven.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row rows = sheetAt.getRow(2);
	Cell cells = rows.getCell(1);
CellType cellTypes = cells.getCellType();
System.out.println("----------Particular Data ------------");
if (cellTypes.equals(CellType.STRING)) {
	String rowvalue = cells.getStringCellValue();
	System.out.println(rowvalue);
}else if (cellTypes.equals(CellType.NUMERIC)) {
	double cellvalue = cells.getNumericCellValue();
	int column = (int) cellvalue;
	System.out.println(column);
}System.out.println("-------------All DATA-------------");
int numberOfRows = sheetAt.getPhysicalNumberOfRows();
for (int i = 0; i <numberOfRows; i++) {
	Row row = sheetAt.getRow(i);
	int numberOfCells = row.getPhysicalNumberOfCells();
	
	
	for (int j = 0; j <numberOfCells; j++) {
		Cell cell = row.getCell(j);
CellType cellType = cell.getCellType();
if (cellType.equals(CellType.STRING)) {
	String rowvalues = cell.getStringCellValue();
	System.out.println(rowvalues);
}else if (cellType.equals(CellType.NUMERIC)) {
	double cellvalue = cell.getNumericCellValue();
	int columns = (int) cellvalue;
	
	System.out.println(columns);
	
}}
}
}}