package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("9000000000");
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("234567");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		  Thread.sleep(2000);
		//  driver.close();

	}

}
