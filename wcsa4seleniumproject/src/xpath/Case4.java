package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-7r54cv9/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[@title='This function is disabled because there are no open tasks available.']")).click();
		driver.findElement(By.xpath("//input[@id='SubmitTTButton']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//img[@src='/img/default/pixel.gif?hash=1692528820']")).click();
		driver.findElement(By.xpath("//div[@id='leaveButton_0_mainContentTd']")).click();
		driver.findElement(By.xpath("//label[@id='LeavePopupRadio_TimeOff_label']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//select[@name='LeaveTypeSelect']")).click();
		driver.findElement(By.xpath("//img[@id='leaveTimeOffIcon']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='LeaveTimeSpent']")).click();
		driver.findElement(By.xpath("//a[@id='wholeDayLink']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='LeavePopupCancel']")).click();
		driver.findElement(By.xpath("//a[@class='item']")).click();
		driver.findElement(By.xpath("//input[@id='showDatesInChronologicalOrder']")).click();
		//driver.close();

	}

}
