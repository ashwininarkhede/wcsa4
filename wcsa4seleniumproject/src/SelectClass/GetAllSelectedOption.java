package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/automation/MultiSelDrop.html");
		Thread.sleep(4000);
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel=new Select (dropdown);
		
		for(int i=1;i<6;i++)
		{
		sel.selectByIndex(i);
		Thread.sleep(2000);
		}
		List<WebElement> alloption = sel.getAllSelectedOptions();
		for(WebElement opts:alloption)
		{
			String values = opts.getText();
			System.out.println(values);
			Thread.sleep(2000);
		}

	}

}
