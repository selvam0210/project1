package com.miniproject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Property_configure {
	
	// Factory design pattern
		static Logger log = Logger.getLogger(Logger_Property_configure.class);
		
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		

		log.debug("Debug");
		log.info("Info");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal Message");
			
	}

}
