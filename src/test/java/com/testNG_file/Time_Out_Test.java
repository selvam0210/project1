package com.testNG_file;

import org.testng.annotations.Test;

public class Time_Out_Test {

	@Test(timeOut = 5000) // --@Test(timeOut = 8000)
	private void demo() throws Throwable {
		
		System.out.println("Browser launch");
		
		Thread.sleep(2000);//  browser launch exceution time
		
		System.out.println("click signin button");
		
		Thread.sleep(1000); //  sign in button execution time
		
		System.out.println("Credentials");
		
		Thread.sleep(3000);// credentials execution time
		
		System.out.println("Navigate to next page");
		
		
		// --@Test(timeOut = 5000)--thread.timeoutexception
		
		

	}
}
