package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownTillParicularElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement ele = driver.findElement(By.xpath("//p[.='Ruby']"));
		Point point = ele.getLocation();
		int xaxis=point.getX();
		int yaxis = point.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(xaxis);
		System.out.println(yaxis);
		js.executeScript("window.scrollBy(\"+xaxis+\",\"+(yaxis-200)+\")");
		
	}

}
