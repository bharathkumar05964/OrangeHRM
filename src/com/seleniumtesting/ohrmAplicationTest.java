package com.seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;



public class ohrmAplicationTest {
	public static void main(String[] args) {


		ChromeDriver driver;
		driver=new ChromeDriver();
		
		//validating login page
		//expected title of the OrangrHRM application Login page should be :-OrangeHRM
		String Expected_title="OrangeHRM";
		System.out.println("the ecpected title of the orangeHRM application is:-"+Expected_title);
		String actual_title=driver.getTitle();
		System.out.println("the actual title of the oramgehrm Appliction is:-"+ actual_title);
		if(actual_title.equals(Expected_title))
				{
			System.out.println("OrangeHRM Application login page title Matched- PASS");
			
			
				}
		else
		{
			System.out.println("OrangeHRm Application login page title NOT Matched- FAIL");
		
			
			
		}
		String Expected_OrangeHRMUrlAddress="orangehrm-4.2.0.1";
		System.out.println("The Expected OrangeHRM Url Address login page is:-"+Expected_OrangeHRMUrlAddress);
		String Actual_OrangeHRMUrlAdress=driver.getCurrentUrl();
		System.out.println("The Expected OrangeHRM Url Address login page is:-"+Actual_OrangeHRMUrlAdress);
		if(Actual_OrangeHRMUrlAdress.contains(Expected_OrangeHRMUrlAddress))
		{
			System.out.println("successfully navigated into OrangeHRM Appliction login Page- Url Adress matched- PASS");
			
		}
		else
		{
			System.out.println("successfully navigated into OrangeHRM Appliction login Page- Url Adress  NOT matched- FAIL");
		}
		//<input name="txtUsername" id="txtUsername" type="text">
		 By UsernameProperty=By.id("txtUsername");
		 WebElement username=driver.findElement(UsernameProperty);
		 username.sendKeys("Bharath");
		 //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		By passwordProperty =By.id("txtPassword");
		 WebElement Password=driver.findElement(passwordProperty);
		Password.sendKeys("Bharath@1433");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By LoginProperty=By.className("button");
		WebElement login=driver.findElement(LoginProperty);
		login.click();
		String ExpectedText_OrangeHRMHomePage="Welcome";
		System.out.println("Expected text OrangeHRM Home page is:-"+ExpectedText_OrangeHRMHomePage);
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		By textProperty=By.id("welcome");
		WebElement text=driver.findElement(textProperty);
	
		String ActualText_OrangeHRMHomePage=text.getText();
		
		
		
		if(ActualText_OrangeHRMHomePage.contains(ExpectedText_OrangeHRMHomePage))
		
		{
		System.out.println("the orangeHRM application home page text is matched-PASS");  
		
		}
		else
		{
			System.out.println("the orangeHRM application home page text is NOT matched-FAIL");
		
		}
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	By HomePageProperty=By.id("welcome");
	WebElement Homepage=driver.findElement(HomePageProperty);
	Homepage.click();
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	By logoutProperty=By.linkText("Logout");
	WebElement Logout=driver.findElement(logoutProperty);
	Logout.click();
		


	
		 
		 
		
		
		
		
		
		

		
				
	}

}
