package com.mini_runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo {
	
	@BeforeSuite
	private void setproperty() {
		System.out.println("set property");
		

	}
	@BeforeTest
	private void browserlaunch() {
		System.out.println("Browser launch");

	}
	@BeforeClass
	private void url() {
		System.out.println("URL");

	}
	@BeforeMethod
	private void login() {
		System.out.println("Login");
		
		
	}
	@Test
	private void women() {
		System.out.println("women");
		

	}
	@Test
	private void men() {
		System.out.println("men");
		

	}
	@Test
	private void kids() {
		System.out.println("kids");
		

	}
	@AfterMethod
    private void logout() {
    	System.out.println("logout");
		
	}
	@AfterClass
	private void verifyhomepage() {
		System.out.println("Verify home page");
	
	}	
	@AfterTest
	private void close() {
		System.out.println("close");

	}
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("Delete all cookies");

	}
	
	
	
	
	
	
	
	
	
	
	
}
