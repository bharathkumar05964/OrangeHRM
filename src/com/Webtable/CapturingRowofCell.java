package com.Webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingRowofCell extends BaseTest


{
	public void get_TableData() throws IOException
	{
		FileInputStream ExcelTestData=new FileInputStream("C:/Users/91756/Desktop/selenum Excel.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(ExcelTestData);
		XSSFSheet WorkbookSheet=Workbook.getSheet("TimeAndDate");
		

		for(int indexRow=1;indexRow<=36;indexRow++)
		{
			Row	newRow=WorkbookSheet.createRow(indexRow-1);

			for(int indexOfCell=1;indexOfCell<=8;indexOfCell=indexOfCell+2)
			{
						
;
				By citynameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+indexRow+"]/td["+indexOfCell+"]");
					
					WebElement cityName=driver.findElement(citynameProperty);


			String	tabledata=cityName.getText();
			Cell newcell=newRow.createCell(indexOfCell-1);
			newcell.setCellValue(tabledata);
			
					
					System.out.print("      "+tabledata);
					
					
			}
			System.out.println();
		}
		FileOutputStream fos=new FileOutputStream("C:/Users/91756/Desktop/selenum Excel.xlsx");
		Workbook.write(fos);
			
				
				
	}
	public void applicationclose()
	{
		driver.close();
	}
public static void main(String[] args) throws IOException {
	CapturingRowofCell Webtable=new CapturingRowofCell();
	Webtable.applicationLaunch();
	
	Webtable.get_TableData();
	Webtable.applicationclose();
	
}
}
