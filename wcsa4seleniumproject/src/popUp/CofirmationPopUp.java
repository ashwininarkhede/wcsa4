package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CofirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/Desktop/automation/confirmationPopUp.html");
		WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
		button.click();
		Alert al = driver.switchTo().alert();
		//accept the popup
		//al.accept();
		Thread.sleep(2000);
		//dismiss the popup
		al.dismiss();
		
		
	}

}
