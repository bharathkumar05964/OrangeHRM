package com.Webtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

	public void applicationLaunch()
	{
	
	System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();


	driver.get(applicationUrlAddress);
	

	driver.manage().window().maximize();

	}

	


}



