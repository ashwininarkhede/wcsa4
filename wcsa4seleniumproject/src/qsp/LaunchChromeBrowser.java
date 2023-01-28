package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver =new ChromeDriver();OR
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\seleniumwcsa04\\geckoDriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.close();*/
		
		

	}

	
	}


