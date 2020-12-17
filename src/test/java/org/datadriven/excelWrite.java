package org.datadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWrite {

public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\mselva\\OneDrive - Hewlett Packard Enterprise\\Testing\\Framework\\DataDriven\\Datafile.xlsx");
		
		Workbook workbook=new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("newfile");
		
		Row row=sheet.createRow(0);
		
		Cell cell=row.createCell(0);
		
		cell.setCellValue("selvam");
		
		FileOutputStream output=new FileOutputStream(file);
		
		workbook.write(output);
		
		System.out.println("done successfully");
		
		
	}


	
}
