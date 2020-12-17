package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTc1 {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\mselva\\OneDrive - Hewlett Packard Enterprise\\Testing\\Framework\\DataDriven\\Datafile.xlsx");
		
		FileInputStream read=new FileInputStream(file);
		
	Workbook workbook=new XSSFWorkbook(read);
	
	Sheet sheet=workbook.getSheet("input");
	
int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
System.out.println(physicalNumberOfRows);
	
	Row row=sheet.getRow(0);
	
int PhysicalNumberOfRows=row.getPhysicalNumberOfCells();
System.out.println(PhysicalNumberOfRows);
	
	
	//Cell cell=row.getCell(1);
	
	//System.out.println(cell);
	
		
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		
		Row row1=sheet.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			
		Cell cel = row1.getCell(j);
		
//		System.out.println(cel);
		
		int type=cel.getCellType();
		
		String value="";
		if (type==1) {
			
			//cell value is string
			
			value=cel.getStringCellValue();
						
		}
			
		else if (DateUtil.isCellDateFormatted(cel)) {
			//cell value is date
			Date d=cel.getDateCellValue();
			System.out.println(d);
			//to change the date into desired format
			
			SimpleDateFormat format=new SimpleDateFormat("MM-dd-yyyy");
			value = format.format(d);
			
		}
		
		else {
			//cell value is number
			
			double d = cel.getNumericCellValue();
			
			//typecasting to get whole number
			long l=(long)d;
			
			value=String.valueOf(l);
	
			
		}
		
		System.out.println(value);
		
	}
		
	}

	}}
