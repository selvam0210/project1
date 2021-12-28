package com.testNG_file;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_demo {
	
	@Test
	private void mobile() {
		System.out.println("Mobile");
		// 10th std
	
	}
	@Test(dependsOnMethods = "watch") // dependsonmethods = 12th
	private void offer() {
		
		System.out.println("offer");
		//--collage
		

	}
	//@Ignore
	@Test
	private void watch() {
		
		System.out.println("watch");
		
		// 12 th std
		
		
		
	}

}
