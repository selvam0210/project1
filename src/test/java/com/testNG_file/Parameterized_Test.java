package com.testNG_file;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {  // ---receiver
	
	
	@Test
	@Parameters({"username", "password"})
	private void credentials(@Optional("Starc") String username, String password) {
		
		System.out.println("Username :"+username);
		
		System.out.println("Password : "+password);
		

	}

}
