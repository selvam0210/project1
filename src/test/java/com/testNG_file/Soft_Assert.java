package com.testNG_file;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
private void demo_username() {
		
		String excepted_username = "Starc";
		
		String actual_username = "tarc";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(excepted_username, actual_username);
		
		System.out.println("Username validation was successful");
		
		
		

	}		

}
