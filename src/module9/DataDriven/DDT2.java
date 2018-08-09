package module9.DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DDT2 {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrow;
	
	@BeforeTest
	public void OpenBrowser() {
		
		//Instantiate a  Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
	}
	
	@Test(dataProvider = "TestData")
	public void TestAUT(String FName, String LName, String Add) throws InterruptedException {
		
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys(FName);
		
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys(LName);
		
		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys(Add);
		
		Thread.sleep(5000);
		
	}
	
	@DataProvider(name = "TestData")
	public Object[][]TestDataFeed() throws IOException, BiffException{
		
		// Specify where is ur Spreadsheet
		FileInputStream fis = new FileInputStream("D:\\Training\\Programs\\Edureka_23July\\src\\module9\\TestData\\TestData.xls");
		
		//Intialise your workbook
		wb = Workbook.getWorkbook(fis);
		
		//Open Sheet
		sh = wb.getSheet(1);
		
		//Get the no of rows to run the loop
		numrow = sh.getRows();
				
		Object [][] FormData = new Object [numrow][sh.getColumns()];
		
		for(int i = 0; i<numrow; i++) {
			
			FormData[i][0] = sh.getCell(0, i).getContents();
			FormData[i][1] = sh.getCell(1, i).getContents();
			FormData[i][2] = sh.getCell(2, i).getContents();
		}
		return FormData;
	}
	
}
