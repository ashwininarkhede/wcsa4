package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class7 {
	static WebDriver driver;
  @Test(description = "this test case is for java")
  public void java() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://desktop-7r54cv9/login.do");
	 
	  Reporter.log("This is java method",true);
  }
}
