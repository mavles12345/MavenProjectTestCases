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

public class sampleExcercise {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\mselva\\workspace\\MavenProjectTestcases\\Exceldata.xlsx");
		
		FileInputStream input=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(input);
		
		Sheet sheet = workbook.getSheet("sheet1");
		
		//Row row=sheet.getRow(0);
		
		//Cell cell=row.getCell(0);
		
		//String value=cell.getStringCellValue();
		
		//System.out.println(value);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				int type=cell.getCellType();
				
				String value="";
				if (type==1) {
					
					value=cell.getStringCellValue();
					
				}
				
				else if (DateUtil.isCellDateFormatted(cell)) {
					
					Date d=cell.getDateCellValue();
					
					//desiredformat
					
					SimpleDateFormat format=new SimpleDateFormat("MM-dd-yyyy");
					value = format.format(d);
					
							
					
				}
				
				else {
					
					double d=cell.getNumericCellValue();
					long l=(long)d;
					value=String.valueOf(l);
					
					
				}
				
				System.out.println(value);
				
			}
		}
		
		
		
		
		
		
	}

}
