package com.testNG_file;

import org.testng.annotations.Test;

public class Invocation_count {
	
	@Test(priority = -1)
	private void browserlaunch() {
		System.out.println("Browser launch");

	}
	@Test(priority = 0)
	private void url() {
		System.out.println("URL");

	}
	@Test(priority = 3, invocationCount = 3)
	private void refresh() {
		
		System.out.println("Refresh");

	}
	

} 
