package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tsrtc_HeadBlockScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "WebDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		String URlAdress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
		driver.get(URlAdress);
		driver.manage().window().maximize();
		By headBlockProperty=By.className("menu");
		WebElement HeadBlock=driver.findElement(headBlockProperty);
		
		By HeadBlockLinksProperty=By.tagName("a");
		List<WebElement>HeadBlockLink=HeadBlock.findElements(HeadBlockLinksProperty);
		int HeadBlockCount=HeadBlockLink.size();
		System.out.println(HeadBlockCount);
		for(int index=0;index<HeadBlockCount;index++)
			
		{
			String headBlockLinkname=HeadBlockLink.get(index).getText();
			System.out.println(headBlockLinkname);
			
			HeadBlockLink.get(index).click();
		//	Thread.sleep(5000);
			
	File	HeadBlockScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	FileUtils.copyFile(HeadBlockScreenshot,new File ("./Screenshots/"+headBlockLinkname+".png"));

	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );

			
			driver.navigate().forward();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	
			 HeadBlock=driver.findElement(headBlockProperty);
			 HeadBlockLink=HeadBlock.findElements(HeadBlockLinksProperty);


			 

			
		
		
		
		
	

}
		
		
	}

}
