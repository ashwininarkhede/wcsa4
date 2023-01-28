package keywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import dataDrivenFramework.Flib;

public class ValidActiUsingBaseTest extends BaseTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		
	Flib flib = new Flib();
		
		int rc = flib.rowCount(EXCEL_PATH,"validcreds");
		
		for(int i=1;i<=rc;i++)
		{
		 String usn = flib.readExcelData(EXCEL_PATH, "validcreds", i, 0);
		 String pass=flib.readExcelData(EXCEL_PATH, "validcreds", i, 1);
		 
		 
		 driver.findElement(By.name("username")).sendKeys(usn);
		 driver.findElement(By.name("pwd")).sendKeys(pass);
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 
		 Thread.sleep(2000);
		
		}
		bt.closeBrowser();
		
	}


	

}
