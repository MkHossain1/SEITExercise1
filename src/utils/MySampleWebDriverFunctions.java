package utils;

//import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MySampleWebDriverFunctions {

	public WebDriver driver;
	public static Logger APPLICATION_LOG= Logger.getLogger("dest1");

	
	//=======================Wait==================
	//--Globalwait/ wait for all web elements in webpage to be loaded
	public void implictWait(int seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	//---Wait until an specific web element to be loaded in the webpage
	public void explicitWait(int time,String locators){
		WebDriverWait wait = new WebDriverWait (driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators)));
	}
	
	
	//=======================TypeWebEditBox=======================================================================
	public void typeByXpath(String locator, String value){
		try{
			driver.findElement(By.xpath(locator)).sendKeys(value);
		}catch(Exception e)
		{
			APPLICATION_LOG.debug("Test Started but Could not Locate Xpath" );
			APPLICATION_LOG.debug(e );
			return;}
	}
	//============================================================================================

	//=======================ClearWebEditBox=======================================================================
		public void clearByXpath(String locator){
			try{
				driver.findElement(By.xpath(locator)).clear();;
			}catch(Exception e)
			{
				APPLICATION_LOG.debug("Test Started but Could not Locate Xpath" );
				APPLICATION_LOG.debug(e );
				return;}
		}
		//============================================================================================
	//=======================Click=======================================================================
	public void clickByXpath(String locator){

		try{
			driver.findElement(By.xpath(locator)).click();
		}catch(Exception e)
		{
			APPLICATION_LOG.debug("Test Started but Could not Locate Xpath" );
			APPLICATION_LOG.debug(e );
			return;}
	}
	//============================================================================================

	//=======================DoubleClick=======================================================================
		public void doubleClickByXpath(String locator){

			try{
				WebElement e=driver.findElement(By.xpath(locator));
				Actions a= new Actions(driver);
				a.doubleClick(e).build().perform();
				
			}catch(Exception e)
			{
				APPLICATION_LOG.debug("Test Started but Could not Locate Xpath" );
				APPLICATION_LOG.debug(e );
				return;}
		}
		//============================================================================================

	//============================RadioButton==============================================================

	

	
	//==========================CheckBox=================================================================
	


	//========================================dropdown====================================================================
	

	
	//============================dragNdrop==============================================================


	

	//================================iFramew===================================================================================
	

	// ----- windows

	//--------alert
	


	//======================xx==========================

}
