package com.Flight.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flight.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
		@FindBy(id="agentName")
		WebElement username;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(name="OK")
		WebElement loginBtn;
	
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}

		public HomePage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			    	
			    			    
			
			return new HomePage();
		}
		
		
		
}
