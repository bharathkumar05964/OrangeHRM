package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Addemploye_namesTest extends Orhm_AddEmployeeTest {
	 	public void PersonalDetailsTest() {
		 String FirstName="Bharath";
		 String MiddleName="Kumar";
		 String LastName="Swargam";
		 By EmployeeIdProperty=By.id("employeeId");
		 WebElement EmployeeId=driver.findElement(EmployeeIdProperty);

			String EmployeId=EmployeeId.getAttribute("value");
		String PersonalDetails="Personal Details";
		///html/body/div[1]/div[3]/div/div[2]/div[1]/h1
		By PersonalDetailsProperty=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1");
		
		WebElement Personal=driver.findElement(PersonalDetailsProperty);
	String	PersonalDetailsText=Personal.getText();
		System.out.println(PersonalDetailsText);
		
		if(PersonalDetails.equals(PersonalDetailsText))
		{
			System.out.println("pass");
			
		}
		
		else
		{
			System.out.println("fail");
		}
		By FirstName1Property=By.id("personal_txtEmpFirstName");
		WebElement FirstName1=driver.findElement(FirstName1Property);
	String	Actual_FirstName=FirstName1.getAttribute("value");
	System.out.println(Actual_FirstName);
	System.out.println(FirstName);
	if(Actual_FirstName.equals(FirstName))
	{
		System.out.println("Actual Firstname Matched ExpectedFirstName:- PASS");
	}
	else
	{
		System.out.println("Actual Firstname NOT Matched Expected FirstName:-FAIL");
		
	}
	By MiddleName1Property=By.id("personal_txtEmpMiddleName");
	WebElement MiddleName1=driver.findElement(MiddleName1Property);
	String Actual_MiddleName=MiddleName1.getAttribute("value");
	System.out.println(Actual_MiddleName);
	System.out.println(MiddleName);
	if(Actual_MiddleName.equals(MiddleName))
	{
		System.out.println("Actual MiddleNmae Matched Expected MiddleName:-PASS");
		
	}
	else
	{
		System.out.println("Actual MiddleNmae NOT  Matched Expected MiddleName:-FAIL");
	}
	By LastName1Property=By.id("personal_txtEmpLastName");
	WebElement LastName1=driver.findElement(LastName1Property);
	 String Actual_LastName=LastName1.getAttribute("value");
	 System.out.println(Actual_LastName);
	 System.out.println(LastName);
	 if(Actual_LastName.equals(LastName))
	 {
		 System.out.println("Actual LastName matched expetced LastName:-PASS");
	 }
	 else
	 {
		 System.out.println("Actual LastName matched expetced LastName:-FALL");
		 
	 }
	 By EmployeId1Property=By.id("personal_txtEmployeeId");
	 WebElement EmployeId1=driver.findElement(EmployeId1Property);
     String	Actual_EmployeId= EmployeId1.getAttribute("value");
	 
     System.out.println(Actual_EmployeId);
     System.out.println(EmployeId);
     if(Actual_EmployeId.equals(EmployeId))
     {
    	 System.out.println("EmployeId Matched:-PASS");
    	 
     }
     else
     {
    	 System.out.println("EmployeId NOT Matched:-FAIL");
    	 
     }
    
     
	}
        public static void main(String[] args) {
        	
        	Addemploye_namesTest ANT=new Addemploye_namesTest();
        	
        	ANT.PersonalDetailsTest();
        	ANT.LaunchBrowser();
        	ANT.PIM_Addempolye();
}
}
