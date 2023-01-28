package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShot04 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		EventFiringWebDriver eft = new EventFiringWebDriver(driver);
		
		eft.get("https://www.instagram.com");
		File src = eft.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShot/ScreenShot04.png");
		Files.copy(src, dest);
		
		Thread.sleep(2000);
		eft.close();
		
		

	}

}
