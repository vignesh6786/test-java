package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static void main(String[] args) throws IOException {
		
		//mention file location of .xlsx excel file
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Test\\excel\\students.xlsx");
		//to read the file 
		FileInputStream fis = new FileInputStream(f);
		//to read .xlsx(workbook)formatted excel file
		Workbook w = new XSSFWorkbook(fis);
		//get the sheet from the workbook
		Sheet s = w.getSheet("students");
		
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("No of rows = "+rows);
		
		int c1=0;
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			int cells = r.getPhysicalNumberOfCells();
			c1 =c1+cells;
			
			
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			//System.out.println(c);
			
		}	
		}
		System.out.println("no of cells = "+c1);
		
		
		
		
		
		
//		Row r = s.getRow(0);
//		System.out.println(r);
		//get no of rows
		//int Rows = s.getPhysicalNumberOfRows();
		
		
				
		//System.out.println("no of rows:"+Rows);
		//get no of cells
		

		
	}

}
