package com.excel.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public void getExcelData() throws IOException{
		File file= new File("./src/test/resources/Testing excel.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//XSSFsheet sht= wb.getSheetAt(1);
		XSSFSheet sht= wb.getSheet("NY");
		//int totalRow=sht.getPhysicalNumberOfRows();
		System.out.println(sht.getPhysicalNumberOfRows());
		for(int i=0;i < sht.getPhysicalNumberOfRows();i++) {
			Row row= sht.getRow(i);
			//row.getLastCellNum();//total colum number
			for(int j=0;j < row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				System.out.println(cell.getStringCellValue());		
			}
		}
	}
public static void main(String[] args) throws IOException  {
	new ReadExcel().getExcelData();
}
}
