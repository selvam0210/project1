package com.mini_runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pom.ImgView_Page;
import com.helper_propertyfile.File_reader_manager;
import com.pom.AddToCart_Page;
import com.pom.ConfirmOrder_Page;
import com.pom.Frame_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.PayCheck_Page;
import com.pom.ProceedToCart_Page;
import com.pom.ProceedToCheck2_Page;
import com.pom.ProceedToCheck3_Page;
import com.pom.ProceedToCheck4_Page;
import com.pom.ProceedToCheckout1_Page;
import com.pom.Tshirt_page;
import com.sdp.Page_Object_Manager;

public class Runner_class extends Base_class {
	public static WebDriver driver = getBrowser("chrome");
	//getbrowser retun type edutha webdriver varum
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Runner_class.class); // location change 
	
	
    //public static AddToCart_Page addpage = new AddToCart_Page(driver);
	// public static int age =10;

  public static void main(String[] args) throws Throwable {
	  
	  PropertyConfigurator.configure("log4j.properties");
		
	    log.info("Browser Launch");
	  
	  String geturl = File_reader_manager.getInstanceFRM().getInstanceCR().geturl();
	  
		url(geturl);
		log.info("Url launch succesfully");
		
		// driver = getBrowser("chrome");  //ithu top la pogum
	
		implicitwait(5000, TimeUnit.SECONDS);

		clickOnElement(pom.getInstancehp().getLogin());
		log.info("login clicked successfuly");
		String getusername = File_reader_manager.getInstanceFRM().getInstanceCR().getusername();
		inputValueElement(pom.getInstancelogin().getPassword(), getusername);
		
		log.info("file reader method");
		
		//String username = particular_Data_From_Excel("C:\\Users\\Welcome\\eclipse-workspace\\maven.miniproject\\write_ganesh.xlsx", 2, 0);
		
       // inputValueElement(pom.getInstancelogin().getEmail(), username);
		//log.info("data read method");
        String password = particular_Data_From_Excel("C:\\Users\\Welcome\\eclipse-workspace\\maven.miniproject\\write_ganesh.xlsx", 3, 1);
        
        
		inputValueElement(pom.getInstancelogin().getPassword(), password);  // numeric ah iruntha print aagum
		clickOnElement(pom.getInstancelogin().getSignin());
		log.info("Signin Succesfully");
		clickOnElement(pom.getInstancet().getTshirt_page());
		executescript(0, 800);
		sleep(4000);
		clickOnElement(pom.getInstancead().getImgView_Page());
		driver.switchTo().frame(pom.getInstancfb().getFrame_Page());
		sleep(4000);
		
		clickOnElement(pom.getInstanceaddpage().getAddToCart_Page());
		//clickOnElement(addpage.getAddToCart_Page());
		driver.switchTo().defaultContent();
		 
		sleep(4000);
		clickOnElement(pom.getInstancepc().getProceedToCart_Page());
		clickOnElement(pom.getInstancepc1().getProceedToCheckout1_Page());
		clickOnElement(pom.getInstancepc2().getProceedToCheck2_Page());
		clickOnElement(pom.getInstancepc3().getProceedToCheck3_Page());
		clickOnElement(pom.getInstancepc4().getProceedToCheck4_Page());
		log.warn("proceed to check 4 times clicked successfully");
		
		clickOnElement(pom.getInstancepc5().getPayCheck_Page());

		clickOnElement(pom.getInstancecp().getConfirmOrder_Page());
		executescript(0, 500);
		log.info("Confirm order successfully");
		
		TakesScreenshot ts = (TakesScreenshot) driver;	
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Ganesh\\eclipse-workspace\\Mini_Project_Selenium\\screenshot\\shot1.png");
		FileUtils.copyFile(source, destination);
			//close();
		
		//quit();
		
		
		
	}
	
}

