package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT1 {

	WebDriver driver;

	@Test(dataProvider = "TestData")
	public void TestForm(String Fname, String Lname) throws InterruptedException {

		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

		// Enter Data in FirstName
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys(Fname);

		// Enter Data in LastName
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys(Lname);

		Thread.sleep(5000);
	}

	@DataProvider(name = "TestData")
	public Object[][] TestDataFeed() {

		Object[][] InputData = new Object[2][2];

		InputData[0][0] = "Amit";
		InputData[0][1] = "Jain";
		InputData[1][0] = "Sam";
		InputData[1][1] = "Joseph";

		return InputData;
	}

}
