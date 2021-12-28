package com.testNG_file;

import org.testng.annotations.Test;

public class Priority_features {

	
	@Test(priority = -1)
	private void women() {
		System.out.println("women");
		

	}
	@Test(priority = 0)
	private void men() {
		System.out.println("men");
		

	}
	@Test(priority = 1)
	private void kids() {
		System.out.println("kids");
		
		
	}
}
