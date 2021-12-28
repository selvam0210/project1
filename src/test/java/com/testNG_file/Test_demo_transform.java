package com.testNG_file;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_demo_transform {

	@Test
	private void credentials() {
		
		String actual = "Smith";
		String excepted = "Smith";
		
		Assert.assertEquals(actual, excepted);
		
		
	}
	@Test
	private void credentials1() {
		
		String actual_name = "Starc@123";
		String excepted_name = "Smith@123";
		
		Assert.assertEquals(actual_name, excepted_name);
		
		
}

}
