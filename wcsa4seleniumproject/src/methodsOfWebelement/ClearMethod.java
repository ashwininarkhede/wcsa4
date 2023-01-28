package methodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-7r54cv9/login.do");
		Thread.sleep(2000);
		WebElement UsernameTextBox = driver.findElement(By.name("username"));
		UsernameTextBox.sendKeys("Admin");
		  Thread.sleep(2000);
		 WebElement Passwordtextbox = driver.findElement(By.name("pwd"));
		 Passwordtextbox.sendKeys("manager");

		Thread.sleep(2000);
		UsernameTextBox.clear();
		Passwordtextbox.clear();
	}

}
