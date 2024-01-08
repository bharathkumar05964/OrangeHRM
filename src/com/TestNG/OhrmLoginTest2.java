package com.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class OhrmLoginTest2 extends Ohrm_LoginTest1 {
	
	XSSFWorkbook workBook;
	@Test
	public void ExcelOperaion() throws IOException
	{
		FileInputStream FIS=new FileInputStream("./src/excelfiles/AddEmployeeTestSheet1.xlsx");
		 workBook=new XSSFWorkbook(FIS);
		XSSFSheet WorkBookSheet=workBook.getSheet("validtestdata");
		int Rows=WorkBookSheet.getLastRowNum();
		int Cell=WorkBookSheet.getRow(0).getLastCellNum();
		System.out.println(Rows);
		for(int indexRow=1;indexRow<=Rows;indexRow++)
		{
			Row CurrentRow=WorkBookSheet.getRow(indexRow);
			for(int Cellindex=0;Cellindex<Cell;Cellindex++)
			{
				Cell CurrentCell=CurrentRow.getCell(Cellindex);
				switch(Cellindex)
				{
				case 0:
					String Expected_loginPanel=CurrentRow.getCell(Cellindex).getStringCellValue();
					ValidatingLoginPage(Expected_loginPanel);
					break;
				
				case 1:
					 CurrentRow.createCell(Cellindex).setCellValue(Actual_LogInPageText);
					 break;
				case 2:
					CurrentRow.createCell(Cellindex).setCellValue(LogInPage_TestResult);
					break;
				case 3:
					String Username1=CurrentRow.getCell(Cellindex).getStringCellValue();
					validUsername(Username1);
					break;
				case 4:
					String Password1=CurrentRow.getCell(Cellindex).getStringCellValue();
					validPassword(Password1);
					break;
				case 5:
					String Expected_HomePagetest=CurrentRow.getCell(Cellindex).getStringCellValue();
					validatingHomePage(Expected_HomePagetest);
					break;
				case 6:
					CurrentRow.createCell(Cellindex).setCellValue(Actual_Welcome);
					break;
				case 7:
					CurrentRow.createCell(Cellindex).setCellValue(HomePageText_results);
					System.out.println(CurrentRow.getCell(Cellindex).getStringCellValue());
					break;
				case 8:
			         String Expecte_ADDEmploye=CurrentRow.getCell(Cellindex).getStringCellValue();
			         validatingAddEmployee(Expecte_ADDEmploye);
			         break;
				case 9:
					CurrentRow.createCell(Cellindex).setCellValue(Actual_EmpoyeeText);
					break;
				case 10:CurrentRow.createCell(Cellindex).setCellValue(AddEmpoyeePageResult);
			
					break;
				case 11:
					String Expected_FirstName=CurrentRow.getCell(Cellindex).getStringCellValue();
					ExpectedFirstName(Expected_FirstName);
					
					break;
				case 12:
					String 	MiddleName=CurrentRow.getCell(Cellindex).getStringCellValue();
					Expected_MiddleName(MiddleName);
					break;
				case 13:
					String 	LastName=CurrentRow.getCell(Cellindex).getStringCellValue();
					Expected_LastName(LastName);
					break;
				case 14:
				Expected_EmployeeId();
				CurrentRow.createCell(Cellindex).setCellValue(Expeced_EmployeId);
					break;
				case 15:
					String 	Expected_personaldetails=CurrentRow.getCell(Cellindex).getStringCellValue();
					validatingPersonalDetails(Expected_personaldetails);
					break;
				case 16:
					CurrentRow.createCell(Cellindex).setCellValue(Actual_PersonalDetailsText);
					break;
				case 17:
					CurrentRow.createCell(Cellindex).setCellValue(	prsonal_DetailsTestresult);
					break;
				case 18:
					ActualFirstName();
					CurrentRow.createCell(Cellindex).setCellValue(Actual_FirstName);
					System.out.println(Actual_FirstName);
					break;
				case 19:
					CurrentRow.createCell(Cellindex).setCellValue(FirstNameTEstResult);
					break;
				case 20:
					Actual_middleName();
					CurrentRow.createCell(Cellindex).setCellValue(Actual_MiddleName);
					break;
				case 21:
					CurrentRow.createCell(Cellindex).setCellValue(MiddleNameTestResult);
					break;
				case 22:
					Actual_LastNumber();
					CurrentRow.createCell(Cellindex).setCellValue(Actual_LastName);
					break;
				case 23:
					CurrentRow.createCell(Cellindex).setCellValue(LastNameTestResult);
					break;
				case 24:
					Actual_employeeId();
					CurrentRow.createCell(Cellindex).setCellValue(Actual_EmployeId);
					System.out.println(Actual_EmployeId);
					break;
				case 25:
					CurrentRow.createCell(Cellindex).setCellValue(EmployeeTestResult);
					break;
				case 26:
					String Expected_loginPanel1=CurrentRow.getCell(Cellindex).getStringCellValue();
					ValidatingLoginPage(Expected_loginPanel1);
					break;
				case 27:
					 CurrentRow.createCell(Cellindex).setCellValue(Actual_LogInPageText);
					 break;
				case 28:
					CurrentRow.createCell(Cellindex).setCellValue(LogInPage_TestResult);
					break;



					
				
					
					
			   
			}
		
		}
		
			
	}
		FileOutputStream FOS=new FileOutputStream("./src/excelfiles/AddEmployeeTestSheet1.xlsx");
		workBook.write(FOS);
	}
	
}
	
