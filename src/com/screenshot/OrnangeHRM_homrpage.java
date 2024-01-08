package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrnangeHRM_homrpage {
	public static void main(String[] args) throws IOException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe ");
	driver=new ChromeDriver();
String Url="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(Url);
driver.manage().window().maximize();
File OhrmScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);




		
	}

}
