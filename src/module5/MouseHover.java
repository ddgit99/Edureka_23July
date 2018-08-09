package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//*[@class = '_2AkmmA _29YdH8']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("Jackets");
		
		
		driver.findElement(By.xpath("//*[@class = 'vh79eN' and @type = 'submit']")).click();

		Thread.sleep(3000);
		
		WebElement Jacket = driver.findElement(By.xpath("//*[@class = '_1Nyybr  _30XEf0']"));
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Jacket).build().perform();
		
		Thread.sleep(3000);
		
		//driver.close();
				
		
	}

}






