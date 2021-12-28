package com.helper_propertyfile;


public class File_reader_manager {  // non static method		
		
	private File_reader_manager() {
		
	}
		
	public static File_reader_manager getInstanceFRM() {  //  static method
		
		File_reader_manager frm = new File_reader_manager();
		
		return frm;
		
	}
	
	
	public Configuration_reader getInstanceCR() throws Throwable   {
		
		Configuration_reader reader = new Configuration_reader();
		
		return reader;
		
		

	}

}
