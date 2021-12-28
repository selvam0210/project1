package com.testNG_file;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {
	@Test
	private void facebook() {
		System.out.println("Facebook");

	}
	@Test
	private void whatsapp() {
		System.out.println("Whatsapp");

	}
	@Test
	private void spotify() {
		System.out.println("Spotify");

	}
	@Test(enabled = false)
	private void wynkmuusic() {
		System.out.println("Wynkmusic");

	}
	@Ignore
	@Test
	private void books() {
		System.out.println("books");

	}

}
