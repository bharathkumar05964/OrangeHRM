package jquery_dropanddrag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddrop {
	
WebDriver driver;

String Url="https://jqueryui.com/droppable/";


	public void BrowserLaunch() 
	{
		
		System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe" );
		
        driver=new ChromeDriver();
        driver.get(Url);
        System.out.println(Url);
        driver.manage().window().maximize();

	}
	public void DragAndDrop()
	{
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		By FrameProperty=By.className("demo-frame");
		
		WebElement Frame=driver.findElement(FrameProperty);
		driver.switchTo().frame(Frame);
		By dragproperty=By.id("draggable");
	WebElement Drag=driver.findElement(dragproperty);
	By DropProperty=By.id("droppable");
	WebElement Drop=driver.findElement(DropProperty);
	
		
	Actions action=new Actions(driver);
	action.moveToElement(Drag)
	.clickAndHold()
	.moveToElement(Drop)
	.release()
	.build().perform();
	
	
	
	
	driver.switchTo().defaultContent();
	 By ResizableProperty=By.linkText("Resizable");
	WebElement Resizable= driver.findElement(ResizableProperty);
	
	Resizable.click();
	
	
	
		
	}
	
	
	
		public static void main(String[] args) {
			DragAnddrop Frame=new DragAnddrop();
			Frame.BrowserLaunch();
			Frame.DragAndDrop();
			
			
		}
	}

