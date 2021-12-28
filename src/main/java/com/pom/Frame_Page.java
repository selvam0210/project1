package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//iframe)[1]")
	private WebElement Frame_Page;

	public Frame_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrame_Page() {
		return Frame_Page;
	}

}
