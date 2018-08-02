package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		
		Thread.sleep(5000);
		
		oSelect.selectByVisibleText("Navigation Commands");
		
		Thread.sleep(5000);
		
		oSelect.deselectByIndex(1);

		Thread.sleep(5000);
		
		List<WebElement> oSize = oSelect.getOptions();
		
		int iListSize = oSize.size();
		
		for(int i = 0; i<iListSize; i++) {
			
			//String sValue = oSelect.getOptions().get(i).getText();
			
			String sValue = oSize.get(i).getText();
			
			System.out.println(sValue);
			
			oSelect.selectByIndex(i);
		
			Thread.sleep(5000);
			
			/*oSelect.deselectByIndex(i);
			
			Thread.sleep(5000);
			*/
		}
		
		oSelect.deselectAll();
				
		
	}

}
