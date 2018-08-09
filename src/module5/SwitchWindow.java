package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		
		//Instantiate a  Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		//Part 1
		String mhandle = driver.getWindowHandle();
		
		System.out.println("Main WIndow Name is -" + mhandle);
		System.out.println("==================================================================================");
		
		Thread.sleep(5000);

		//Part 2
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/div/p[3]/button")).click();
		Thread.sleep(5000);
		
		//Part 3
		Set awName = driver.getWindowHandles();
		
		
		System.out.println("All WIndow Names -" + awName);
		System.out.println("==================================================================================");
		Thread.sleep(5000);
		
		//Part 4
		
		for(String newHandle : driver.getWindowHandles()) {
		
			Thread.sleep(5000);
			driver.switchTo().window(mhandle);
			Thread.sleep(5000);
			driver.switchTo().window(newHandle);
			Thread.sleep(5000);
		
		}
		driver.quit();
	}

}









