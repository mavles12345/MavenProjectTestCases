package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mselva\\workspace\\MavenProjectTestcases\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		return driver;

	}
	
	//Url
	public static void loadurl(String url) {
		driver.get(url);
		
	}
	
	public static void quitBrowser() {
		
		driver.quit();
		
	

	}

	public static WebDriver title() {
		
		driver.getTitle();
	
		return driver;
		
}
	
	public static void fill(WebElement element, String text ) {
	
element.sendKeys(text);
		
	}
	
public static void txtButton(WebElement element) {
	
	element.click();

}	
	
public static String excelRead(int rowNo, int cellNo) throws IOException {

	File file=new File("C:\\Users\\mselva\\OneDrive - Hewlett Packard Enterprise\\Testing\\Framework\\DataDriven\\Datafile.xlsx");
	
	FileInputStream read=new FileInputStream(file);
	
	Workbook workbook=new XSSFWorkbook(read);
	
	Sheet sheet=workbook.getSheet("facebook");
	
		
		Row row=sheet.getRow(rowNo);
	
	    Cell cell=row.getCell(cellNo);
			
			int type = cell.getCellType();
			String value="";
			
			if (type==1) {
				
				 value=cell.getStringCellValue();
				
			}
			
			else if (DateUtil.isCellDateFormatted(cell)) {
				
				Date d=cell.getDateCellValue();
				
				SimpleDateFormat date=new SimpleDateFormat("MM-dd-yyyy");
				 value = date.format(d);
				
				
			}
			
			else {
				
				double number = cell.getNumericCellValue();
				
				long l=(long)number;
				
				 value = String.valueOf(l);
				
				
			}
			
			return value;
			
		}


}

	

