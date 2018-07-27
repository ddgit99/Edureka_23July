package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		

		//Instantiate a  Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://www.facebook.com/");

		List <WebElement> list = driver.findElements(By.tagName("select"));
	
		System.out.println("Total no of Tag - "+list.size());
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}

}
