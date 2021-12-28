package com.testNG_file;

import org.testng.annotations.Test;

public class Grouping_features {

	@Test(groups = "Social Media")
	private void facebook() {
		System.out.println("facebook");
		
		
	}
	@Test(groups = "Social Media")
	private void whatsapp() {
		
		System.out.println("whatsapp");
		
	}
	@Test(groups = "Music")
	private void spotify() {
		
		System.out.println("spotify");
		
	}
	@Test(groups = "Music")
	private void wynkmusic() {
		System.out.println("wynkmusic");
		
	}
	@Test(groups = "Books")
	private void books() {
		System.out.println("books");
		

	}
	
}
