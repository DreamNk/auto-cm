package com.ghx.auto.cm.ui.sso.page;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;


public class ReadWritePasswordExcelPage extends CMAbstractPage<ReadWritePasswordExcelPage> {

	static int cellval2 ;
	static int Number;
	static String Char;
	
			
	public String read_data_excel(String filePath,String fileName,String sheetName)throws IOException{
		
		FileInputStream inputStream=new FileInputStream(filePath);
		Workbook Test = null;
		String fileExtensionName = fileName.substring(fileName.indexOf(".")); 
		
		//Check condition if the file is xlsx file//
		if(fileExtensionName.equals(".xlsx")){
		Test = new XSSFWorkbook(inputStream);
		}
		
		Sheet sh=Test.getSheet(sheetName);
		Row row=sh.getRow(1);                                 //  Column 'B' in the sheet // 
		
		Cell cell1=row.getCell(1);
		String cellval1=cell1.getStringCellValue();
		Char = cellval1;
		
		Cell cell2=row.getCell(2);							 //  Row '2' in the sheet // 
		cellval2 = (int) cell2.getNumericCellValue();
		Number = cellval2;
		return Char+Number;									// Get Char = Value of 'B2'     &    Number = Value of 'C2' //
		
	}
	
public ReadWritePasswordExcelPage write_data_excel(String filePath,String fileName,String sheetName)throws IOException{
		
		Number = ++cellval2;                                  // Increment Number i.e Value of 'C2' //
		FileInputStream inputStream = new FileInputStream(filePath);
		Workbook Test = null;
		String fileExtensionName = fileName.substring(fileName.indexOf(".")); 
		
		//Check condition if the file is xlsx file//
		if(fileExtensionName.equals(".xlsx")){
		Test = new XSSFWorkbook(inputStream);
		}
		 
		Sheet sheet = Test.getSheet(sheetName);
		Row newRow = sheet.getRow(1);
		
		Cell cell0 = newRow.createCell(1);						
		cell0.setCellValue(Char);
		
	    Cell cell1 = newRow.createCell(2);					// Set Incremental Number in 'C2' //
	    cell1.setCellValue(Number);
	    
	    Cell cell2 = newRow.createCell(4);					// New Column E //
	    cell2.setCellValue(Char+Number);                   // Set Incremental Combine Value(CharNumber) in 'E2' //
	    
		FileOutputStream outputStream = new FileOutputStream(filePath);
		
		    Test.write(outputStream);
			outputStream.close();
			System.out.println("New Password Updated in sheet"+" - "+Char+Number);
			return this;
	
	}
	
}
