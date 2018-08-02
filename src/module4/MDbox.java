package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MDbox {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.in/2018/04/popups.html");

		driver.findElement(By.xpath("//*[@id=\'post-body-5871078819124590039\']/a")).click();

		driver.findElement(By.xpath("//*[@id=\'post-body-5871078819124590039\']/div/div/input")).sendKeys("Abhresh");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\'post-body-5871078819124590039\']/div/div/ul[1]/li[2]/button")).click();
		
		Thread.sleep(5000);
		
		Alert a = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		a.accept();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\'post-body-5871078819124590039\']/div/div/ul[1]/li[1]/button")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
