package datadriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Writedataex {
@Test
	void ExcelWrite() throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Data\\Writedata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();  //create workbook
		XSSFSheet sheet=workbook.createSheet(); //create sheet
		XSSFRow row1=sheet.createRow(0);    //create row
		
		row1.createCell(0).setCellValue("admin");     //write into 1st cell in 1st row
		row1.createCell(1).setCellValue("admin123");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("latha");
		row2.createCell(1).setCellValue("latha123");
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("writing completed");
		

		
	}
}
