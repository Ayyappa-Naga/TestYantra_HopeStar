package com.hopestar.GenericUtility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;





public class WebDriver_Utility 
{
	WebDriver driver = null;	
	/**
	 * This Method is used to Maximize the window
	 * @author Ayyappa$Naga
	 * @param driver
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	/**
	 * This method is used  to avoid synchronzation issue
	 * @author Ayyappa$Naga
	 * @param driver
	 */
	public void implicitwait(WebDriver driver ) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/**
	 * This Method is used to provide time until element is visible
	 * @author Ayyappa$Naga
	 * @param driver
	 * @param ele
	 */
	public void waitForElementVisiblity(WebDriver driver,WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	/**
	 * This method is used to switch to window
	 * @author Ayyappa$Naga
	 * @param driver
	 * @param partialTitle
	 */
	public void switchWindow(WebDriver driver,String partialTitle) 
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i1 = windows.iterator();
		while(i1.hasNext()) {
			String wid = i1.next();
			String title=driver.switchTo().window(wid).getTitle();
			if(title.contains(partialTitle))
				break;
		}}

	/**
	 * This Method is used to select option from drop down using index
	 * @author Ayyappa$Naga
	 * @param ele
	 * @param index
	 */
	public void dropDownSelect(WebElement ele,int index) 
	{
		Select s = new Select(ele);
		s.selectByIndex(index);			
	}

	/**
	 * This Method is used to select option from drop down using index
	 * @author Ayyappa$Naga
	 * @param ele
	 * @param text
	 */
	public void dropDownSelect(WebElement ele,String text) 
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);			
	}

	/**
	 * This Method is used to select option from drop down using index
	 * @author Ayyappa$Naga
	 * @param value
	 * @param ele
	 */
	public void dropDownSelect(String value,WebElement ele) 
	{
		Select s = new Select(ele);
		s.selectByValue(value);			
	}
	/**
	 * This Method is used to Switch to alert and accept
	 * @author Ayyappa$Naga
	 * @param driver
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This Method is used to Switch to alert and accept
	 * @author Ayyappa$Naga
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();		}

	/**
	 * This Method is Used to  Switch To child Frame
	 * @author Ayyappa$Naga
	 * @param driver
	 * @param ind
	 */
	public void switchToFrame(WebDriver driver ,int ind) {
		driver.switchTo().frame(ind);

	}

	/**
	 * This Method is used to switch to Main Frame
	 * @author Ayyappa$Naga
	 * @param driver
	 */
	public void switchToMainFrame(WebDriver driver ) {
		driver.switchTo().defaultContent();

	}



	/**
	 * This Method is used to start the browser
	 * @author Ayyappa$Naga
	 * @param driver
	 * @return
	 * @throws Throwable
	 */
	public WebDriver  launchBrowser() throws Throwable {

		File_Utility fi = new File_Utility();
		String Browser=fi.readDataFromProFile("browser");


		if(Browser.equalsIgnoreCase("chrome")) {
		
			driver = new ChromeDriver();			
		}

		else if(Browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}

		else if(Browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();	
		}
		else {
			
			driver = new ChromeDriver();
		}
		return driver;}

	/**
	 * This Method is used to Right Click On perticular element
	 * @author Ayyappa$Naga
	 * @param driver
	 */
	public void actRightClick(WebDriver driver )
	{
		Actions act= new Actions(driver);
		act.contextClick().perform();
	}



	/**
	 * This Method is used to Double Click on a element
	 * @author Ayyappa$Naga
	 * @param driver
	 */
	public void doubleClick(WebDriver driver) 
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}

	/**
	 * This Method is used to mouse over to perticular element and perform click On it
	 * @author Ayyappa$Naga
	 * @param driver
	 * @param ele
	 */
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
	}

	/**
	 * This method is used to Drag and drop a element
	 * @author Ayyappa$Naga
	 * @param driver
	 * @param src
	 * @param dest
	 */
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest ) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest);
	}

	/**
	 * This Method is Used to scroll The page
	 * @author Ayyappa$Naga 
	 * @param driver
	 */
	public void scrollBar(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
  
	}

	/**
	 * This Method is Used to Scroll to the page to a Perticular Element
	 * @param driver
	 * @param ele
	 */
	public void scrollToElement(WebDriver driver ,WebElement ele) {
		int yCo= ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+yCo+")", ele);
	}
	/**
	 * This Method is Used to take Screen shot 
	 * @author Ayyappa$Naga
	 * @param driver
	 * @param ScreeenShotName
	 * @return
	 * @throws Throwable
	 */
	public String  takeScreenShot(WebDriver driver ,String ScreeenShotName) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot) driver ;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path=".\\screenshot\\"+ScreeenShotName+".png";
		File dst = new File(path);
	Files.copy(src, dst);
		return path;

	}
	
	/**
	 * This Method Is Used to Scroll the Page Until End 
	 * @author Ayyappa$Naga
	 * @param driver
	 */
	public void scrollToPageEnd(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	
/**
 * This Method is used to Perform Scroll Until Ele Is Displayed 
 * @author Ayyappa$Naga	
 * @param driver
 * @param ele
 */
public void scrollToEle(WebDriver driver,WebElement ele)
{
	for(;;)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		if(ele.isDisplayed())
		{
			break;
		}
	}}
	

/**
 * This Method is used to scroll to a element until it is viewable on Screen
 * @author Ayyappa$Naga
 * @param ele
 * @param driver
 */
	public void scrollToEle(WebElement ele,WebDriver driver )
	{ 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	
	}
}
	
	
	
	
	
	
	
	


