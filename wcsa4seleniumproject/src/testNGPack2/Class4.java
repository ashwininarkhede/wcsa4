package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class4 {
	static WebDriver driver;
  @Test
  public void selenium() {
	  System.setProperty("webdriver.gecko.driver", "./drivers/GeckoDriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("selenium");
	  driver.quit();
  }
}
