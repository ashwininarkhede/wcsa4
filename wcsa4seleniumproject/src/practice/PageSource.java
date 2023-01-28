package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String src = driver.getPageSource();
		System.out.println(src);

	}

}
