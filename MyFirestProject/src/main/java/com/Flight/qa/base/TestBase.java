package com.Flight.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class TestBase {
	
	
	public static DesktopOptions option;
	
	public static WiniumDriver driver;
	public static Properties prop;

	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\WINIUM_WS\\MyFirestProject\\src\\main\\resources\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization() throws MalformedURLException{
		
		
		String WinAppName = prop.getProperty("AppName");
		DesktopOptions option= new DesktopOptions();
		option.setApplicationPath(WinAppName);
		
		 driver= new WiniumDriver(new URL("http://localhost:9999"), option);
		
		
	}
	
	
	
	
	
	
	
	
	



}
