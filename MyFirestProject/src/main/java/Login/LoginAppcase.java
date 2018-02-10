package Login;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flight.qa.base.TestBase;

public class LoginAppcase extends TestBase{
	
	
	@BeforeMethod
	public void setup() throws MalformedURLException{
		initialization();
		
	}
	
	@Test
	public static void test1() throws InterruptedException, MalformedURLException{
		//initialization();
		Thread.sleep(9000);
		driver.findElementById("agentName").sendKeys("john");
		driver.findElementById("password").sendKeys("HP");
		driver.findElementByName("OK").click();
	}
	
	@AfterMethod
	public void closeWin(){
		driver.close();
	}

}
