package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en?gclid=EAIaIQobChMIvbqhi5Ts-wIVUHRgCh0YAwfTEAAYASABEgIlWPD_BwE&utm_aud=OTH&utm_campaign=BS_GGL_SEA_TXT_OTH_Brand_New&utm_medium=BS&utm_obj=OLC&utm_source=GGL");
		driver.findElement(By.xpath("//h3[.='Softride Pro Coast Training Shoes' and('w-full bg-puma-black-800 aspect-1-1') ]' ]")).click();
		Thread.sleep(2000);
		

	}

}
