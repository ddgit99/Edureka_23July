package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		driver.findElement(By.id("prompt")).click();

		Alert pAlert = driver.switchTo().alert();

		Thread.sleep(5000);
		
		pAlert.sendKeys("Abhresh");
		
		Thread.sleep(5000);
		
		pAlert.accept();
		
	}

}
