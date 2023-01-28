package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-7r54cv9/login.do");
		
		String actualLoginTitle = driver.getTitle();
	if(actualLoginTitle.equals("actiTIME - Login"))
	{
		System.out.println("Login page Tilte is match : Test case is Passed!!");
	}
	else
	{
		System.out.println("Login page Tilte is not match : Test case is Failed!!");
	}
		driver.findElement(By.name("username")).sendKeys("Admin"); 
		 // Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home page Tilte is match : Test case is Passed!!");
		}
		else
		{
			System.out.println("Home page Tilte is not match : Test case is Failed!!");
		}
		

	}

}
