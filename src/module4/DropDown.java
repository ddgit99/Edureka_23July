package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		Select oSelect = new Select(driver.findElement(By.name("continents")));
		
		Thread.sleep(5000);
		
		oSelect.selectByIndex(2);

		Thread.sleep(5000);
		
		oSelect.selectByValue("e");

		Thread.sleep(5000);
		
		oSelect.selectByVisibleText("Antartica");
		
			
	}
}






