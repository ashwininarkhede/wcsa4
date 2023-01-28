package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/automation/frame.html");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement usn = driver.findElement(By.id("i1"));
		Thread.sleep(3000);
		usn.sendKeys("admin");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("id1"));
		password.sendKeys("manager");
		driver.close();
	}

}
