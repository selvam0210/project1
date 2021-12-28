package com.miniproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
public static void main(String[] args) throws Throwable {
	try {
		System.out.println("Data create");
	File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\maven.miniproject\\DataDriven.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet createsheet = wb.createSheet("Emp Details");
	Row createRow = createsheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	Sheet sheet = wb.getSheet("Emp Details");
	
	createCell.setCellValue("User Data");
	wb.getSheet("Emp Details").getRow(0).createCell(1).setCellValue("user password");
	wb.getSheet("Emp Details").createRow(1).createCell(0).setCellValue("Ganesh");
	wb.getSheet("Emp Details").getRow(1).createCell(1).setCellValue("123@jkh");

	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("created");
	} catch (Exception e) {
e.printStackTrace();
	}
	
}
}
