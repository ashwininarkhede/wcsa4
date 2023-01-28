package SelectClass;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDupliusingLinkedList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/Desktop/automation/MultiSelDrop.html");
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel = new Select (dropdownelement);
		List<WebElement> allOption = sel.getOptions();
		//HashSet<String> s = new HashSet<String>();
		//TreeSet<String>s=new TreeSet<String>();
		LinkedList<String>s=new LinkedList<String>();
		for(int i=0;i<allOption.size();i++)
		{
		WebElement opt = allOption.get(i);
		String values = opt.getText();
		//to add the text of WebElement by removing duplicate object
		s.add(values);
		}
		for(String option:s)
		{
			System.out.println(option);
		}
	
	}

}
