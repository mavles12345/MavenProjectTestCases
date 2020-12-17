package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUpdate {
	
	public static void main(String[] args) throws IOException {
		
File file=new File("C:\\Users\\mselva\\OneDrive - Hewlett Packard Enterprise\\Testing\\Framework\\DataDriven\\Datafile.xlsx");
		
		FileInputStream input=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(input);
		
		Sheet sheet=workbook.getSheet("newfile");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		
		if (value.equals("selvam")) {
			
			cell.setCellValue("Thishiyan");
			

		}
		
		FileOutputStream output=new FileOutputStream(file);
		
		workbook.write(output);
		
		System.out.println("done successfully");
		
		
	}
	

	}


