package module8.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.gson.annotations.Until;

import module8.Object.GoogleHomePageObjects;
import module8.Object.SeleniumHomePageObject;

public class GoogleSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		page.SearchGoogle("SeleniumHQ");
		
		page.ClickSelenium();
		Thread.sleep(5000);
		
		SeleniumHomePageObject Sel = new SeleniumHomePageObject(driver);

		Thread.sleep(5000);
		Sel.ClickDownload();
		
		Thread.sleep(5000);
		Sel.ClickHome();
		
	}
}
