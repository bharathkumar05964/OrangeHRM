package com.excelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class MultipleTestDataohrmLoginPage {
	public static void main(String[] args) throws IOException {
		  WebDriver driver;
		   System.setProperty("webdriver.chrome.driver", "./WebDriverFiles/chromedriver.exe");
		   driver=new ChromeDriver();
		 String  OhrmUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/validateCredentials";
		 driver.get(OhrmUrl);
	
		
		
		FileInputStream ExcelTestData=new FileInputStream("C:/Users/91756/Desktop/selenum Excel.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(ExcelTestData);
		XSSFSheet WorkbookSheet=Workbook.getSheet("LoginTestData");
		int Rowcount=WorkbookSheet.getLastRowNum();
		driver.manage().window().maximize();
		
		
		for(int rowindex=1;rowindex<Rowcount;rowindex++)
		{
			Row row=WorkbookSheet.getRow(rowindex);
			

			Cell	testdatacell=row.getCell(0);
		   String UsernameTestData=testdatacell.getStringCellValue();
		   testdatacell=row.getCell(1);
			 String  TestDataPassword =testdatacell.getStringCellValue();
			 
		   
		   //System.out.println(UsernameTestData);
		   		   
		 By  usernameProperty=By.id("txtUsername");
		 WebElement username=driver.findElement(usernameProperty);
		 username.sendKeys(UsernameTestData);
		 
		 By passwordProperty=By.id("txtPassword");
		WebElement  password=driver.findElement(passwordProperty);
		password.sendKeys(TestDataPassword);
		By loginProperty=By.id("btnLogin");
	WebElement	login=driver.findElement(loginProperty);
	login.click();
	
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		if(Url.equals(OhrmUrl))
		{
			Cell Newcell=row.createCell(2);
			Newcell.setCellValue("Fail");
			
			File Fail=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Fail, new File("./Screenshots/FialImages/"+UsernameTestData+" -  "+TestDataPassword+".png"));
			
		}
		else
		{
		Cell	Newcell=row.createCell(2);
		Newcell.setCellValue("PASS");
		By HomePageProperty=By.id("welcome");
		WebElement Homepage=driver.findElement(HomePageProperty);
		Homepage.click();
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		By logoutProperty=By.linkText("Logout");
		WebElement Logout=driver.findElement(logoutProperty);
		Logout.click();	
		
				
				}
		
		
		
	}
		
		FileOutputStream TestoutData=new FileOutputStream("C:/Users/91756/Desktop/selenum Excel.xlsx");
		Workbook.write(TestoutData);
			

		
		}
	
	
			
					


}
