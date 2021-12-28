package com.miniproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_write {
	
	public static  void write_datas1() throws IOException {
		
		File f = new File("F:\\ganesh\\writedata.xlsx");
		
		FileInputStream fis = new FileInputStream(f);  // wb.get--kodukurathala fileinputstream 
		
		Workbook wb = new XSSFWorkbook(fis);
		
//		Sheet createSheet = wb.createSheet("Data");		
//		Row createRow = createSheet.createRow(0);		
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue("Username");  // setcellvalue--string
		
		
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Username");
	
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Pssword");
		// getrow-- varathula fileinputstream kodukurom
		
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("starc");
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue(5664);
		
		FileOutputStream fos = new FileOutputStream(f); // file ku output kodukurom
		
		wb.write(fos);
		
		
		//System.exit(0);
		wb.close();
		
		System.out.println("Write successfully");
			
	}
	
	public static void main(String[] args) throws Throwable {
		
		write_datas1();
		
	}

}
