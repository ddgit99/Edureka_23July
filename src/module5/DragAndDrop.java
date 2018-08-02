package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(iFrame);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		Thread.sleep(5000);
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		Thread.sleep(5000);

		act.dragAndDrop(Source, Target).build().perform();
		
	}

}
