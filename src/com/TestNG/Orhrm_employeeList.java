package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orhrm_employeeList {
	 WebDriver driver;
	  String  OhrmUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/validateCredentials";
	  @BeforeTest
	  public void LaunchBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver", "./WebDriverFiles/chromedriver.exe");
		   driver=new ChromeDriver();
		 String  OhrmUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/validateCredentials";
		 driver.get(OhrmUrl);
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
		driver.manage().window().maximize(); 
	  }
	  @Test(priority=1)
	  public void PIM_Addempolye()
		{
		By PIMproperty=By.id("menu_pim_viewPimModule");
		 WebElement PIM=driver.findElement(PIMproperty);
		 Actions action=new Actions(driver);
		 
		 action.moveToElement(PIM).build().perform();
		 By configurationProperty=By.id("menu_pim_Configuration");
		 WebElement configuration=driver.findElement(configurationProperty);
		 
		 action.moveToElement(configuration).build().perform();
		 By EmployeelistProperty=By.id("menu_pim_viewEmployeeList");
		WebElement Employeelist=driver.findElement(EmployeelistProperty);
		Employeelist.click();
		}
	  @AfterTest
	  public void ApplicationClose()
	  {
		  driver.quit();
	  }

}
