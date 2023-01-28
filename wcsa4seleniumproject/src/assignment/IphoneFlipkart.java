package assignment;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneFlipkart {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']")).click();
		Thread.sleep(4000);
		Set<String> handles = driver.getWindowHandles();
		for(String win:handles)
		{
		   driver.switchTo().window(win);
		}
	
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("423102");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	}

}
