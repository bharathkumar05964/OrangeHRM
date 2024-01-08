package com.Webtable;







import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Dynamic_WetableData {
	
	
		WebDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
        
		public void applicationLaunch()
		{
		
		System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();


		driver.get(applicationUrlAddress);
		

		driver.manage().window().maximize();
		}
		public void get_TableData() throws IOException
		{
			FileInputStream ExcelTestData=new FileInputStream("C:/Users/91756/Desktop/selenum Excel.xlsx");
			XSSFWorkbook Workbook=new XSSFWorkbook(ExcelTestData);
			XSSFSheet WorkbookSheet=Workbook.getSheet("DynamicWebTable");
			

			
 
		By TablerowProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr");
		List<WebElement> TableRow=driver.findElements(TablerowProperty);
		int Rowcount=TableRow.size();
		System.out.println(Rowcount);
		By TableCellProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td");
		List<WebElement> TableCell=driver.findElements(TableCellProperty);
		int  Cellcount=TableCell.size();
		System.out.println(Cellcount);
		for(int indexRow=1;indexRow<=Rowcount;indexRow++)
		{
		Row	newRow=WorkbookSheet.createRow(indexRow-1);

	for(int indexOfCell=1;indexOfCell<=Cellcount;indexOfCell++)
	{
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
		public static void main(String[] args) throws IOException {
			Dynamic_WetableData WebTable=new Dynamic_WetableData();
			WebTable.applicationLaunch();
			WebTable.get_TableData();
	
}
}



