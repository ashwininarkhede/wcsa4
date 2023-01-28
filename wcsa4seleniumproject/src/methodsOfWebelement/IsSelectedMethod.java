package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-7r54cv9/login.do");
		
		WebElement checkbox = driver.findElement(By.name("remember"));
		boolean status1 = checkbox.isSelected();
		System.out.println(status1);
		checkbox.click();
		Thread.sleep(2000);
		boolean status2 = checkbox.isSelected();
		System.out.println(status2);
		
	}

}
