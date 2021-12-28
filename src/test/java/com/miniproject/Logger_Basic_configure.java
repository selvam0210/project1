package com.miniproject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_Basic_configure {
	
	// Factory design pattern
	static Logger log = Logger.getLogger(Logger_Basic_configure.class);
	
	
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Debug");
		log.info("Info");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal");
		
					
	}

}
