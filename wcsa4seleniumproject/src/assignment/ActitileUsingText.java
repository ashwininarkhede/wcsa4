package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitileUsingText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://desktop-7r54cv9/login.do");
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("//td[.='Username:']"));
		driver.findElement(By.xpath("//input[.='Username:']"));
		Thread.sleep(2000);
		driver.close();

	}

}
