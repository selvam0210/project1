package com.testNG_file;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_Datas {  //---Data provider
	
	@Test(dataProvider = "testdata")
	private void data(String username, int password) {
		
		System.out.println("Username :"+username);
		System.out.println("Password :"+password);
		//System.out.println("Values :"+values);
		

	}
	@DataProvider
	private Object[][] testdata() {
		
		return new Object[][] {
			
			{"Starc", 56},
			{"smith", 49}
		//	{"ganesh", 23},
		//	{"smith", 22}
		};
		
	
	}

}
