package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Naukri {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Programs\\SeleniumTutorial\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.naukri.com/nLogin/Login.php");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='usernameField' or @id = 'emailTxt']")).click();
		
		driver.findElement(By.xpath("//*[@id='passwordField' or id='pwd1']")).click();
		
		String Text = driver.findElement(By.id("usernameField_err")).getText();
		
		boolean Result = Text.equals("Email ID/Username cannot be left blank");
		
		System.out.println("Result - " + Result);
		
	}

}
