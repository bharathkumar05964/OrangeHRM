package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonYourWishlist {
	WebDriver driver;
	String url="http://amazon.in";

	
	
public void applicationLounch()
{
	
	System.setProperty("webdriver.chrome.driver", "./WebDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
}
public void YourWishListTest()
{
	By hellosigninProperty=By.id("nav-link-accountList");
WebElement	HelloSignIn=driver.findElement(hellosigninProperty);
Actions HelloSignInaction=new Actions(driver);
HelloSignInaction.moveToElement(HelloSignIn).build().perform();
By YourListProperty=By.className("nav-text");
WebElement YourWish = driver.findElement(YourListProperty);

YourWish.click();


	
}
public void ApplicationClose()
{
	driver.close();
}

public static void main(String[] args) {
	AmazonYourWishlist Amazon=new AmazonYourWishlist();
	Amazon.applicationLounch();
	Amazon.YourWishListTest();
	Amazon.ApplicationClose();
	
}



}


