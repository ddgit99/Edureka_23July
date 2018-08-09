package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		//Instantiate a  Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		WebElement uName = driver.findElement(By.id("email"));

		Actions act = new Actions(driver);
	
		Action newact = act
				.moveToElement(uName)
				.keyDown(uName, Keys.SHIFT)
				.sendKeys("abhresh")
				.keyUp(uName, Keys.SHIFT)
				.doubleClick(uName)
				.contextClick()
				.build();
		
		newact.perform();
		
	}

}
