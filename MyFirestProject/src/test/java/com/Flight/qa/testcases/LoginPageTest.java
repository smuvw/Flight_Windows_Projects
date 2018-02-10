package com.Flight.qa.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flight.qa.base.TestBase;
import com.Flight.qa.pages.HomePage;
import com.Flight.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}

	
	@BeforeMethod
	public void setUp() throws MalformedURLException{
		initialization();
		loginPage = new LoginPage();	
	}
	
	
	@Test
	public void loginTest(){
		
		homePage = loginPage.login("john", "HP");
	}
	
}
