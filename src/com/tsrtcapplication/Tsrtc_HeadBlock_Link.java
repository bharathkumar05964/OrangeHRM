package com.tsrtcapplication;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tsrtc_HeadBlock_Link {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "WebDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URlAdress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
		driver.get(URlAdress);
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
			
			driver.navigate().forward();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			
			 HeadBlock=driver.findElement(headBlockProperty);
			 HeadBlockLink=HeadBlock.findElements(HeadBlockLinksProperty);
			 HeadBlockCount=HeadBlockLink.size();
			 

			
		
		}
		
		
	}

}


