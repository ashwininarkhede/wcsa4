package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/automation/button.html");
		WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
		button.click();
		//now switch your control
		Alert al = driver.switchTo().alert();//alert is interface
		//accept the alert pop up
		Thread.sleep(2000);
		//al.accept();
		// dissmiss alert pop up
		//al.dismiss();
		//text of alert pop up
		String textofAlert = al.getText();
		System.out.println(textofAlert);
		al.sendKeys("admin");
	}

}
