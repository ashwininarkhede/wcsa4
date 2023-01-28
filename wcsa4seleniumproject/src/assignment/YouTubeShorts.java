package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeShorts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/shorts/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Shorts']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']")).click();//for every video is changes
	
	}

}
