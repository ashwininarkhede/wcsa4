package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {
	static WebDriver driver;
  @Test(description = "this test case is for sql")//here we can use descripton flag
  public void sql() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("sql");
  }
}
