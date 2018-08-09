package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Senario1 {

	WebDriver driver;

	@Test
	public void openApp() {

		// Browser Instantiating Or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();

		// Open AUT
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(dependsOnMethods = "openApp")
	public void Login() throws InterruptedException {
		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

		/*// click Continue
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(3000);*/
	}

	@Test(dependsOnMethods = "Login", enabled = false)
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();

		Thread.sleep(3000);

	}

}
