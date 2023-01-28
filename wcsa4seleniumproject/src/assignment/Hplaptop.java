package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hplaptop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Core i5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		driver.findElement(By.xpath("//div[.='HP']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Operating System']")).click();
		driver.findElement(By.xpath("//div[.='Windows 10']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[.='Customer Ratings']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='4★ & above']")).click();
		Thread.sleep(2000);

		String price = driver.findElement(By.xpath("//div[.='HP Pavilion Gaming Core i5 11th Gen - (8 GB/512 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce RT...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(price+":price of HP LAPTOP");
		driver.close();
	}

}
