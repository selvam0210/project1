package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.AddToCart_Page;
import com.pom.ConfirmOrder_Page;
import com.pom.Frame_Page;
import com.pom.Home_Page;
import com.pom.ImgView_Page;
import com.pom.Login_Page;
import com.pom.PayCheck_Page;
import com.pom.ProceedToCart_Page;
import com.pom.ProceedToCheck2_Page;
import com.pom.ProceedToCheck3_Page;
import com.pom.ProceedToCheck4_Page;
import com.pom.ProceedToCheckout1_Page;
import com.pom.Tshirt_page;

public class Page_Object_Manager {
	

	public WebDriver driver;
	
	// private classname objname;
	
	private Home_Page hp;
	private Login_Page login;
	private Tshirt_page t;
	private ImgView_Page ad;
	private Frame_Page fb;
	private AddToCart_Page addpage;
	private ProceedToCart_Page pc;
	private ProceedToCheckout1_Page pc1;
	private ProceedToCheck2_Page pc2;
	private ProceedToCheck3_Page pc3;
	private ProceedToCheck4_Page pc4;
	private PayCheck_Page pc5;
	ConfirmOrder_Page cp;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
			
	}
	public Home_Page getInstancehp() {
		if (hp==null) {
			hp = new Home_Page(driver);
		}
		
		return hp;
	}
	public Login_Page getInstancelogin() {
		if (login==null) {
			login = new Login_Page(driver);
				
		}
		return login;
	
	}
	public Tshirt_page getInstancet() {
		if (t==null) {
			t = new Tshirt_page(driver); 
			// (pom)--object--> parameter constructor koduthu vacha nala driver varum
		}
		return t;

	}
	public ImgView_Page getInstancead() {
		if (ad==null) {
			ad = new ImgView_Page(driver); // ipudi maridum
		///ImgView_Page ad = new ImgView_Page(driver); // ipudi irunthu
			// class variable la maridum so outside the method la use panikalam
		}
		return ad;
		
	}
	public Frame_Page getInstancfb() {
		if (fb==null) {
			fb = new Frame_Page(driver);
		}
		return fb;
		
	}
	public AddToCart_Page getInstanceaddpage() {
		if (addpage==null) {
			addpage = new AddToCart_Page(driver);
		}
		return addpage;
	
	}
	
	
	
	public ProceedToCart_Page getInstancepc() {
		if (pc==null) {
			pc = new ProceedToCart_Page(driver);
		}
		return pc;

	}
	public ProceedToCheckout1_Page getInstancepc1() {
		if (pc1==null) {
			pc1 = new ProceedToCheckout1_Page(driver);
		}
		return pc1;
		

	}
	public ProceedToCheck2_Page getInstancepc2() {
		if (pc2==null) {
			pc2 = new ProceedToCheck2_Page(driver);
			
		}
		return pc2;

	}
	public ProceedToCheck3_Page getInstancepc3() {
		if (pc3==null) {
			pc3 = new ProceedToCheck3_Page(driver);
		}
		return pc3;

	}
	public ProceedToCheck4_Page getInstancepc4() {
		if (pc4==null) {
			pc4 = new ProceedToCheck4_Page(driver);
		}
	return pc4;

	}
	public PayCheck_Page getInstancepc5() {
		if (pc5==null) {
			pc5 = new PayCheck_Page(driver);
			
		}
		return pc5;

	}
	public ConfirmOrder_Page getInstancecp() {
		if (cp==null) {
			cp = new ConfirmOrder_Page(driver);
		}
		return cp;

	}


	

}



	


		

	

	
	



