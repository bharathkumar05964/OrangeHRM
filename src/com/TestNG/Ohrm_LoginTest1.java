package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ohrm_LoginTest1 {
	String Expected_loginPanel;
	String Actual_LogInPageText;
	String LogInPage_TestResult;
	String Actual_Welcome;
	String HomePageText_results;
	String Actual_EmpoyeeText;
	String AddEmpoyeePageResult;
	String Expecte_ADDEmploye;
	String Expeced_EmployeId;
	String Actual_PersonalDetailsText;
	String prsonal_DetailsTestresult;
	String Expected_middlename;
	String Expected_Lastname;
	String Actual_FirstName;
	String FirstName;	
	String FirstNameTEstResult;
	String Actual_MiddleName;
	String MiddleNameTestResult;
	String LastName;
	String LastNameTestResult;
	String Actual_LastName;
	String Actual_EmployeId;
	String EmployeeTestResult;

	
	WebDriver driver;
	 String  OhrmUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/validateCredentials";
	@BeforeTest
	  public void LaunchBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver", "./WebDriverFiles/chromedriver.exe");
		   driver=new ChromeDriver();
		   String  OhrmUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/validateCredentials";
		 driver.get(OhrmUrl);
		 driver.manage().window().maximize();
	  }
	
	public void ValidatingLoginPage(String Expected_loginPanel) {
		By LoginPanelProperty=By.id("logInPanelHeading");
		WebElement LoginPanel=driver.findElement(LoginPanelProperty);
		 Actual_LogInPageText=LoginPanel.getText();
		System.out.println(Actual_LogInPageText);
		System.out.println(Expected_loginPanel);
		if(Actual_LogInPageText.equals(Expected_loginPanel))
		{
			LogInPage_TestResult="PASS";
		}
		else
			
		{
			LogInPage_TestResult="FAIL";
			
		}
	}
	
	public void validUsername(String Username1)
	{
		
		 By UsernameProperty=By.id("txtUsername");
		 WebElement username=driver.findElement(UsernameProperty);
		 username.sendKeys(Username1);
	}
	

	public void validPassword(String Password1)
	{
		By passwordProperty =By.id("txtPassword");
		 WebElement Password=driver.findElement(passwordProperty);
		 Password.sendKeys(Password1);
		By LoginProperty=By.className("button");
		WebElement login=driver.findElement(LoginProperty);
		login.click();
	}
	
	public void validatingHomePage(String Expected_HomePagetest)
	{
		By WelcomeProperty=By.id("welcome");
		WebElement Welcome1=driver.findElement(WelcomeProperty);
		Actual_Welcome=Welcome1.getText();
		System.out.println(Actual_Welcome);
		System.out.println(Expected_HomePagetest);
		if(Actual_Welcome.contains(Expected_HomePagetest))
		{
			HomePageText_results="PASS" ;
		}
		else
		{
			HomePageText_results="FAIL";
	   
		}
		By PIMproperty=By.id("menu_pim_viewPimModule");
		 WebElement PIM=driver.findElement(PIMproperty);
		 Actions action=new Actions(driver);
		 
		 action.moveToElement(PIM)
		.moveToElement(PIM). build().perform();
		 By configurationProperty=By.id("menu_pim_Configuration");
		 WebElement configuration=driver.findElement(configurationProperty);
		 
		 action.moveToElement(configuration).build().perform();
		 By EmployeelistProperty=By.id("menu_pim_viewEmployeeList");
		WebElement Employeelist=driver.findElement(EmployeelistProperty);
		action.moveToElement(Employeelist);

		 By AddEMployeeProperty=By.id("menu_pim_addEmployee");
		 WebElement AddEMployee=driver.findElement(AddEMployeeProperty);
		 AddEMployee.click();

	
	
	
	
	}

	
	public void validatingAddEmployee(String Expecte_ADDEmploye)
	{
				///html/body/div[1]/div[3]/div/div[1]/h1
		By AddEmplyeeProperty=By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1");
		WebElement AddEployee=driver.findElement(AddEmplyeeProperty);
		Actual_EmpoyeeText=AddEployee.getText();
		if(Actual_EmpoyeeText.equals(Expecte_ADDEmploye))
		{
			AddEmpoyeePageResult="PASS";
		}
		else
		{
			AddEmpoyeePageResult="FAIL";
		}
		System.out.println(AddEmpoyeePageResult);
		
	}
	public void ExpectedFirstName(String Expected_FirstName)
	{
		FirstName=Expected_FirstName;
		 By FirstNameProperty=By.id("firstName");
		 WebElement firstname=driver.findElement(FirstNameProperty);
		 firstname.sendKeys(FirstName);
	}
	public void Expected_MiddleName(String MiddleName)
	{
	Expected_middlename	=MiddleName;
		 By MiddleNameProperty=By.id("middleName");
		 WebElement miidlename=driver.findElement(MiddleNameProperty);
		 miidlename.sendKeys(Expected_middlename);
	}
	public void Expected_LastName(String LastName)
	{
		Expected_Lastname=LastName;
		 By LastNameProperty=By.id("lastName");
		 WebElement lastname=driver.findElement(LastNameProperty);
		 lastname.sendKeys(Expected_Lastname);
	}
	public void Expected_EmployeeId()
	{
		
		 By EmployeeIdProperty=By.id("employeeId");
		 WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
		  Expeced_EmployeId=EmployeeId.getAttribute("value");
		
		

	}
	public void validatingPersonalDetails(String Expected_Personaldetails)
	{
		By SaveButtonProperty=By.id("btnSave");
		WebElement Save=driver.findElement(SaveButtonProperty);
		Save.click();
	
		By PersonalDetailsProperty=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1");
		WebElement Personal=driver.findElement(PersonalDetailsProperty);
			Actual_PersonalDetailsText=Personal.getText();
		System.out.println(Actual_PersonalDetailsText);
		if(Actual_PersonalDetailsText.equals(Expected_Personaldetails))
		{
			prsonal_DetailsTestresult="PASS";
		}
		else
		{
			prsonal_DetailsTestresult="FAIL";
		}
			
		
	}
	public void ActualFirstName(){
		By FirstName1Property=By.id("personal_txtEmpFirstName");
		WebElement FirstName1=driver.findElement(FirstName1Property);
			Actual_FirstName=FirstName1.getAttribute("value");
			if(Actual_FirstName.equals(FirstName))
			{
				FirstNameTEstResult="PASS";
				
			}
			else
			{
				FirstNameTEstResult="FAIL";
			}
	}
	public void Actual_middleName()
	{
		By MiddleName1Property=By.id("personal_txtEmpMiddleName");
		WebElement MiddleName1=driver.findElement(MiddleName1Property);
		 Actual_MiddleName=MiddleName1.getAttribute("value");
		if(Actual_MiddleName.equals(Expected_middlename))
		{
			MiddleNameTestResult="PASS";
		}
		else
		{
			MiddleNameTestResult="FAIL";
		}

	}
	public void Actual_LastNumber()
	{
		By LastName1Property=By.id("personal_txtEmpLastName");
		WebElement LastName1=driver.findElement(LastName1Property);
		  Actual_LastName=LastName1.getAttribute("value");
		 if(Actual_LastName.equals(Expected_Lastname))
		 {
			 LastNameTestResult="PASS";
		 }
		 else
		 {
			 LastNameTestResult="FAIL";
		 }
	}
	public void Actual_employeeId()
	{
		 By EmployeId1Property=By.id("personal_txtEmployeeId");
		 WebElement EmployeId1=driver.findElement(EmployeId1Property);
	     	Actual_EmployeId= EmployeId1.getAttribute("value");
	     	if(Actual_EmployeId.equals(Expeced_EmployeId))
	     	{
	     		EmployeeTestResult="PASS";
	     	}
	     	else
	     	{
	     		EmployeeTestResult="FAIL";
	     	}
	     	 By homePageWelcome=By.id("welcome");
	     	   WebElement welcomeAdmin=driver.findElement(homePageWelcome);
	     	   welcomeAdmin.click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		 
	     	   By ohrmLogout=By.linkText("Logout");
	     	   WebElement logOutButton=driver.findElement(ohrmLogout);
	     	   logOutButton.click();

	}
		 
	
	@AfterTest
	public void ApplicationClose()
	{

	}
}
   
    
		
	
	
	

		
		
		
		
	
		 
		 

	  
	
	
			

		
	

