package com.testNG_file;

import org.testng.annotations.Test;

public class Excepted_Exceptions {
	
	
	
	@Test(expectedExceptions = NullPointerException.class)
	
	//---->	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		
		int age = 10;
		
		System.out.println(age/10);

	}

}
