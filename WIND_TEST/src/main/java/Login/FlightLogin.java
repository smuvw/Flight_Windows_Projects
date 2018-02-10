package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;



public class FlightLogin  {
	
	public static DesktopOptions option;
	
	public static WiniumDriver driver;
	public static Properties prop;
	
	public static void Setup() throws MalformedURLException{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\WINIUM_WS\\MyFirestProject\\src\\main\\resources\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	  String WinAppName = prop.getProperty("AppName");
	
	  System.out.println(WinAppName);
	  DesktopOptions option= new DesktopOptions();
	  option.setApplicationPath(WinAppName);
	
	WiniumDriver driver= new WiniumDriver(new URL("http://localhost:9999"), option);
	
	}
	
	
	public static void main(String[] args) throws MalformedURLException {
		Setup();
		
	}

}
