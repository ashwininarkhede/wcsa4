package readExcelData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.Flib;

public class ActiTimeInvalidCreds {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-7r54cv9/login.do");
		Thread.sleep(2000);
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActitimeTestData.xlsx", "invalidcreds");
		
		for(int i=1;i<rc;i++)
		{
			String username=flib.readExcelData("./data/ActitimeTestData.xlsx", "invalidcreds", i, 0);
			String password=flib.readExcelData("./data/ActitimeTestData.xlsx", "invalidcreds", i, 1);
			
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys(username);
	    Thread.sleep(2000);
	    WebElement pass = driver.findElement(By.name("pwd"));
		pass.sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		Thread.sleep(2000);
		}
		
	}

}
