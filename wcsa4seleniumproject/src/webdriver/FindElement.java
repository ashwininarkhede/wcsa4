package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
	       System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://desktop-7r54cv9/login.do");
	       
	        WebElement usernameTextBox = driver.findElement(By.name("username"));
	        usernameTextBox.sendKeys("admin");
	        System.out.println(usernameTextBox);

	}

}
