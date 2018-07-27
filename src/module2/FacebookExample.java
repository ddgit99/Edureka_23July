package module2;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {

	public static void main(String[] args) {
		
		//Instantiate a  Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://www.facebook.com/");
		
		/*// Using ID locator to enter data into various fields
		driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		
		// Using Name locator to enter data into various fields
		driver.findElement(By.name("lastname")).sendKeys("Sugandhi");
		
		// Using classname locator to enter data into various fields
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		driver.findElement(By.className("inputtext")).sendKeys("Trainer");
		
		
		// Using Linktext & Partial Link Text locator to enter data into various fields
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Why do I need to")).click();
		*/
		
		// Using Xpath locator to enter data into various fields
		// Absolute Xpath - "html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"
		//Relative Xpath -  ".//*[@id='u_0_o']" //*[@id='u_0_o']
		
		//Absolute Xpath
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("0987654321");
		
		//Relative Xpath
		driver.findElement(By.xpath("//*[@id=\'u_0_v']")).sendKeys("Abhresh");
		
		// Using Css locator to enter data into various fields
		driver.findElement(By.cssSelector("#u_0_j")).sendKeys("Abhresh");
		
	}
	

}
