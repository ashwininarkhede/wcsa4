package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrameByFrameElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		//driver.switchTo().frame("fc_widget");
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Admin");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("chat-fc-email")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9000000000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Start Chat')]")).click();
		driver.close();
		

}
}
