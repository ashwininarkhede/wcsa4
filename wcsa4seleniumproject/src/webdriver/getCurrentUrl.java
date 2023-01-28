package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Admin/Desktop/automation/demo5.html");
		 String CurrentUrl = driver.getCurrentUrl();
		 Thread.sleep(2000);
		 System.out.println(CurrentUrl);


	}

}
