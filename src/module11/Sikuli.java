package module11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed {
		
		//Instantiate a  Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.edureka.co/");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		Screen s = new Screen();
		
		s.getScreen().click("D:\\Training\\Programs\\Sikuli\\Ed_Login.JPG");
		
		
	}

}
