package datadriven;

import java.io.FileInputStream;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readexceldata {
@Test
	void Excelread() throws IOException {
	
    	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Data\\readex.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");        //workbook.getsheetAt(0)
		
		int totalrows=sheet.getLastRowNum();       //no of rows in sheet
		int totalcells=sheet.getRow(1).getLastCellNum();      //no of cells in row
		System.out.println("no of rows:"+totalrows);
		System.out.println("no of cells in a row:"+totalcells);
		 
		for(int r=0;r<=totalrows;r++) {
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++) {
				XSSFCell cell=currentrow.getCell(c);   //goto current cell
				String value=cell.toString();      //read the cell data
				System.out.print(value+"  ");
				
			}
			System.out.println();
		}
workbook.close();
file.close();
	}
	
}
