package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSwitchTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("JAVA",Keys.ENTER);

	}

}
