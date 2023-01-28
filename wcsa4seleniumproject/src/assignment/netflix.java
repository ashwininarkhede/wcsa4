package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://www.netflix.com/in/login");
		 
		 // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("9000000000");
		  driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("234567");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
		  Thread.sleep(2000);
		  driver.close();

	}

}
