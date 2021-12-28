package com.sdp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	
	public static  WebDriver driver;   //  driver---> null
	
	public static String value;  //  null
	
	// public static int age;----> null  ( static variable )
	
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {   
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
			 driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		
			 driver = new FirefoxDriver();   //  normal variable --class, static
		
		}
		
		driver.manage().window().maximize();
		return driver;	// driver fixed ah irukum
	
	}
	
	public static void url (String url) {
		driver.get(url);
			
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
    public static void inputValueElement(WebElement element,String value) {	
    	element.sendKeys(value);
    	
}
   public static void quit() {
   	driver.quit();
    	
   }
    public static void sleep(int seconds) throws Throwable {
    	Thread.sleep(seconds);

	} 
    public static void close() {
    	driver.close();
    }
     
    public static void  executescript(int value, int range) {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	
	}
    
   public static  void implicitwait(int seconds, TimeUnit format) {
	  driver.manage().timeouts().implicitlyWait(seconds, format);

}    
//public static void maximize() {
//	driver.manage().window().maximize();
//
//}
//   public static void dropdown(String type, WebElement element, String value) {
//	   Select s = new Select(element);
//	   if (type.equalsIgnoreCase("index")) {
//		
//		   int index = Integer.parseInt(value);
//		   s.selectByIndex(index);
//	}
//	   else if (type.equalsIgnoreCase("value")) {
//		
//		   s.selectByValue(value);
//	}
//	   else if (type.equalsIgnoreCase("text")) {
//		s.selectByVisibleText(value);
	//}
	   
//}
   public static String particular_Data_From_Excel(String path, int row_index, int cell_Index) throws IOException {
	   File f = new File(path);
	   
	   FileInputStream fis = new FileInputStream(f);
	   Workbook wb = new XSSFWorkbook(fis);  //  Up casting
	   Sheet sheetAt = wb.getSheetAt(0);
	   Row row = sheetAt.getRow(row_index);
	   Cell cell = row.getCell(cell_Index);
	   CellType cellType = cell.getCellType(); // cell type---enum
	if (cellType.equals(CellType.STRING)) {
		   
		    value = cell.getStringCellValue();
			// --value --refname--topla irukum
			//String value = cell.getStringCellValue(); //local variable to change-- class, static variable
			 	 
	
	}
	   else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		int val = (int) numericCellValue;
		 value = String.valueOf(val);
		
		// int to string --integer.parseint();
	}
	   
	  
	return value;   


}
	
    
    
	}


