package com.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_TestFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream ExcelTestDataFile=new FileInputStream("C:\\Users\\91756\\Desktop\\selenum Excel.xlsx");
		//identify the workbook
		XSSFWorkbook WorkBook=new XSSFWorkbook(ExcelTestDataFile);
		//identify the worksheet
		XSSFSheet TestDataSheet=WorkBook.getSheet("Sheet1");
		//identify the particular row of the sheet
	Row	TestData_sheetRow=TestDataSheet.getRow(0);
	//identify the roe of the cell
	Cell Testdata_cell=TestData_sheetRow.getCell(0);
	//get the data row of cell
String	TestData=Testdata_cell.getStringCellValue();
	}

}
