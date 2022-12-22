package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.Baseclass;

public class Launchbrowser extends Baseclass{
	
	public static void main(String[] args) throws IOException {
		
		launchBrower();
		maximizeWindow();
		launchurl();
		
	}

	
		
	

}
