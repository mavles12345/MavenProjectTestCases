package org.datadriven;

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

public class DataDrivenTC2 {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\mselva\\OneDrive - Hewlett Packard Enterprise\\Testing\\Framework\\DataDriven\\Datafile.xlsx");
		
		FileInputStream read=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(read);
		
		Sheet sheet=workbook.getSheet("input");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row=sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell=row.getCell(j);
				
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
				
				System.out.println(value);
				
			}
			
			
		}
		
	}

}
