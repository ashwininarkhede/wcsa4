package robotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class usingAct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//p[.='Username : Admin']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']"));
		Thread.sleep(2000);
	//	WebElement tar = driver.findElement(By.xpath("//p[.='Password : admin123']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		 act.doubleClick(target).perform();
		 Thread.sleep(2000);
		// act.doubleClick(tar).perform();
		

	}

}
