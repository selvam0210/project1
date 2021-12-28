package com.helper_propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {  //  Configuration_reader --->class name
	
	public static Properties p;//  --- null
	// private classname refname(pom)
	
	public Configuration_reader() throws IOException {  // Configuration_reader---> constructor name

		File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\maven.miniproject\\src\\main\\java\\com\\property_file\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();  //  local variable to class variable
		
		p.load(fis);	
	}
	
	public String geturl() {	
		
		String url = p.getProperty("url");
		
		return url;
		
	}
	
	public String getusername() throws IOException {

		String username = p.getProperty("username");
		
		return username;
			

	}

}
