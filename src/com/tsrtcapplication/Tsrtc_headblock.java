package com.tsrtcapplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_headblock {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "WebDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URlAdress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
		driver.get(URlAdress);
		By HomepageLinkpropery=By.tagName("a");
		 List<WebElement>homePageLink=driver.findElements(HomepageLinkpropery);
		
		  int Linkcount=homePageLink.size();
		  System.out.println(Linkcount);
		  for(int index=0;index<Linkcount;index++)
		  {
			  String LinkName=homePageLink.get(index).getText();
			  System.out.println(Linkcount+""+LinkName);
			  
		  }
		  
		  
		  
		
	}
}