package com.testNG_file;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {
	
	
	@Test   //  ---> illana print aagathu
	private void demo_username() {
		
		String excepted_username = "Starc";
		//String actual_usesrname = "Starc"; //-- sucessful
		
		String actual_usesrname = "starc";//---failed---Assertion error
		 
//		 Assert.assertEquals(excepted_username, actual_usesrname);
//		 
//		 System.out.println("username validation was successful");
		
		Assert.assertEquals(excepted_username, actual_usesrname);
		
		//System.exit(0);
		//  --program terminate aagathu because it is assert
		
		System.out.println("Username validation was successful");
		

	}
	
	@Test(priority = 1) 
	private void demo_password() {
		
		String excepted_password = "Starc@123";
		
		String actual_password = "Starc@123";

		Assert.assertEquals(excepted_password, actual_password);
		
		System.out.println("Password validation was successful");
	}

}
