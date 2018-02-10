package Login;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class LoginFlightApp {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		DesktopOptions option= new DesktopOptions();
		Thread.sleep(9000);
		
		option.setApplicationPath("C:\\Program Files (x86)\\HP\\Unified Functional Testing\\samples\\Flights Application\\FlightsGUI.exe");
			
		Thread.sleep(9000);
		WiniumDriver driver= new WiniumDriver(new URL("http://localhost:9999"), option);
		
		Thread.sleep(9000);
		driver.findElementById("agentName").sendKeys("john");
		driver.findElementById("password").sendKeys("HP");
		driver.findElementByName("OK").click();
		
		String t=driver.findElementByName("BOOK FLIGHT").getAttribute("Name");
		System.out.println(t);
	
		
	}

}
