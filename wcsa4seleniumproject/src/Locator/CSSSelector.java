package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);  
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("button[class='_acan _aiit _acap _aijb _acas _aj1-']")).click();

	}

}
