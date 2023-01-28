package testNgPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	static WebDriver driver;
  @BeforeMethod
 
  public void setUp() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://desktop-7r54cv9/login.do");
	
	  
  }
  @AfterMethod
	 public void tearDown()
	 {
    driver.quit();		
	 }
 
}
