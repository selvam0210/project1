package com.testNG_file;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun_test implements IRetryAnalyzer  {

	int start = 0;
	
	int end = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (start<end) {
			
			// 0<3, 1<3, 2<3,---true
			
			start++;
			
			return true; //---execute
			
		}
		
		// 3<=3---true aagum
		// 3<3--condition false
		return false;  //  --execution stop
	}
	
	

}
