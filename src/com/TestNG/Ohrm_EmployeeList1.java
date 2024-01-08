package com.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Log;

public class Ohrm_EmployeeList1 extends Orhrm_employeeList {
	@Test(priority=2)
	public void EmployeeListIntoExcel() throws IOException
	{
		FileInputStream ExcelTestData=new FileInputStream("./src/excelfiles/EmployeeList.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(ExcelTestData);
		XSSFSheet WorkbookSheet=Workbook.getSheet("EmplyeeList");
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[5]
		By TablerowProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr");
		List<WebElement> TableRow=driver.findElements(TablerowProperty);
		int Rowcount=TableRow.size();
		System.out.println(Rowcount);
		By TableCellProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td");
		List<WebElement> TableCell=driver.findElements(TableCellProperty);
		int  Cellcount=TableCell.size();
		System.out.println(Cellcount);
		for(int indexRow=1;indexRow<=Rowcount;indexRow++)
		{
			Row	newRow=WorkbookSheet.createRow(indexRow);

			for(int indexOfCell=1;indexOfCell<=Cellcount;indexOfCell++)
			{
				///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
				By citynameProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr["+indexRow+"]/td["+indexOfCell+"]");

				WebElement cityName=driver.findElement(citynameProperty);
				String	tabledata=cityName.getText();
				Cell newcell=newRow.createCell(indexOfCell);
				newcell.setCellValue(tabledata);
				Log.info(tabledata);
				System.out.print("      "+tabledata);
			
			}
			System.out.println(); 
		}
		FileOutputStream fos=new FileOutputStream("./src/excelfiles/EmployeeList.xlsx");
		Workbook.write(fos);
	}
}
	





