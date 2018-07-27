package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		
		//Instantiate a  Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "D:\\Training\\Installation stuff\\Exe Files\\geckodriver.exe");
		WebDriver FF = new FirefoxDriver();*/
		
		//Get Commands
		driver.get("URL"); // open AUT URL
		driver.getTitle(); // it captures the title of the page
		driver.getCurrentUrl(); // to get the current url on the browser
		driver.getWindowHandle(); // get the details of the window opened
		
		//Navigation Commands
		driver.navigate().to("URL"); // navigate from one to other URL (mostly used in these cases but not compulsory)
		driver.navigate().back(); // to move to the previous page
		driver.navigate().forward(); // to move to the next page
		driver.navigate().refresh(); // page refresh
		
		//Close and Quit
		driver.close(); //close the current session
		driver.quit(); //		
		
	}

}
