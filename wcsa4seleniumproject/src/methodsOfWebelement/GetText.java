package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(20000);
		driver.get("http://omayo.blogspot.com/");
		
		//Thread.sleep(20000);
		WebElement link= driver.findElement(By.partialLinkText("popup window"));
		String textoflink = link.getText();
		System.out.println(textoflink);
	}
		
}
