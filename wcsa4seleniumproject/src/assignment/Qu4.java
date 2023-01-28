package assignment;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//HOW TO CLOSE CHILD WINDOW
public class Qu4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("-------------------------------");
		Set<String> all = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String wh:all)
		{
			System.out.println(wh);
			if(!parent.equals(wh))
			{
				driver.switchTo().window(wh).close();
				
			}
			else
			{
				
			}
		}
}
}
