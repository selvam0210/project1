package com.testNG_file;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_test_Iretry {  //  --Test_demoi_method
	
	
	@Test(retryAnalyzer = Rerun_test.class)
	private void credentials() {
		
		String actual = "Smith";
		String excepted = "smith";
		
		Assert.assertEquals(actual, excepted);
		// --this method is true so iretry rerun aagathu
		
	}
	@Test(retryAnalyzer = Rerun_test.class)
	private void credentials1() {
		
		String actual_name = "Starc@123";
		String excepted_name = "Smith@123";
		
		Assert.assertEquals(actual_name, excepted_name);
		
		//--this method is false so rerun aagum
		//---@Test(retryAnalyzer = Rerun_test.class)

}
}