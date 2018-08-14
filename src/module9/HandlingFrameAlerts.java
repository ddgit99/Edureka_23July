package module9;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrameAlerts {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
	WebDriver Browser = new ChromeDriver();
	Browser.get("https://www.goindigo.in/?linkNav=home_header");
	Browser.manage().window().maximize();
	WebElement OnewayTrip = Browser.findElement(By.xpath("//*[@href = '#oneWay']"));
	
	OnewayTrip.click();
	Thread.sleep(4000);
	WebDriverWait wait = new WebDriverWait(Browser,20);
	WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class ='btn buttonGlbl btn-close button-trigger' ]")));
	popup.click();
	Thread.sleep(4000);
	//Browser.switchTo().frame(By.name(name));
	Browser.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]")).clear();
	Thread.sleep(4000);
	Browser.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]")).sendKeys("Lucknow");
	Thread.sleep(4000);
	Browser.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[2]/input[1]")).sendKeys("blr");
	Select AdultPassenger = new Select(Browser.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[1]/label[2]/select")));
	//List OptionValue = AdultPassenger.getOptions();
	//System.out.println("Option = " + OptionValue);
	AdultPassenger.selectByVisibleText("5");
	Select ChildPassenger = new Select(Browser.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[2]/label[2]/select")));
	ChildPassenger.selectByVisibleText("3");
	if (Browser.findElement(By.xpath("//*[@id='search-form']/button")).isEnabled()) 
	{
		System.out.println("True");
		Thread.sleep(2000);
		Browser.findElement(By.xpath("//*[@id='search-form']/button")).click();
	}
	Browser.close();
}
}