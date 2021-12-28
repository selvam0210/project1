package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;  // --null
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement login;  // // private WebElement element;

	public Home_Page(WebDriver driver2) { // parameterised constructor
		 this.driver = driver2;// driver2 --->runner class driver
		 
		 //this current class refernce
		 
		 PageFactory.initElements(driver, this);// initilalize webElement;
		 
		 //driver(initialize element)--->@findby iruka chech pannum
	}

	public WebElement getLogin() {
		return login;
	}

}
/// driver2(refname)  la runner class driver iruku