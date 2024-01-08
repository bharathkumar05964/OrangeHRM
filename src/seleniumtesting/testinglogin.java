package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testinglogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe" );
		ChromeDriver driver= new ChromeDriver();
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		String urladress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(urladress);
		driver.findElement(By.id("txtUsername")).sendKeys("Bharath");	
		driver.findElement(By.id("txtPassword")).sendKeys("Bharath@1433");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.linkText("/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule")).clear();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("bharath");
		driver.findElement(By.id("searchSystemUser_userType")).sendKeys("1");
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_nationality"));
		//<input type="button" class="" id="btnAdd" name="btnAdd" value="Add">
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/nationality" id="menu_admin_nationality">Nationalities</a>
		driver.findElement(By.id("menu_admin_nationality")).click();
		driver.findElement(By.id("btnAdd")).click();
		//<input type="text" name="[namenationality]" class="formInput" maxlength="100" id="nationality_name">
		driver.findElement(By.name("[namenationality]")).sendKeys("india");
		//<a href="#" id="menu_admin_Job" class="arrow">Job</a>
		driver.findElement(By.id("menu_admin_Job")).sendKeys("1");

		
		
		//sdrieearchSystemUser[userType]
//		<span class="quickLinkText">Assign Leave</span>
//		<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
		
	}

}

