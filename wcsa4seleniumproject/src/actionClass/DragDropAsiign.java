package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAsiign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));////p[.='Drag me to my target']
	
		driver.get("https://jqueryui.com/droppable/");
		 
		 Thread.sleep(4000);
		WebElement src = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.id("//p[.='Drop here']"));
		 Actions act = new Actions(driver);
		// Thread.sleep(2000);
		 act.dragAndDrop(src, target);

	}

}
