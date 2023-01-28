package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelData {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//excel sheet path
		Workbook wb = WorkbookFactory.create(fis);//make the file for read
		Sheet sheet = wb.getSheet("IPL");//take sheet name
		Row row = sheet.getRow(3);//get value of row
		Cell cell = row.getCell(1);//get value of cell
		String data = cell.getStringCellValue();//it will give the value present in cell
		System.out.println(data);
		
	

}
}
