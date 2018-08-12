package module7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridTest {

	static WebDriver driver;
	static String nodeUrl;
	
	@BeforeTest
	public void Setup() throws MalformedURLException {
		
	nodeUrl = "http://192.168.1.55:5566/wb/hub";
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	driver = new RemoteWebDriver(new URL(nodeUrl), cap);		
	}
	
	@Test
	public void SimpleTest() {
		driver.get("http://edureka.co");
		
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}	
}
