package FrameworkAnnotations;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class utils extends FrameworkAnnotations {

	public void maximize(Hashtable<String,String> table) {
		if (driver != null) {
			driver.manage().window().maximize();
			test.log(LogStatus.INFO, "Testdata used:" +table);
		}
	}

	public void navigate(Hashtable<String,String> table, String url) throws InterruptedException {
		if (driver != null) {
			test.log(LogStatus.INFO, "Navigating to URL:"+url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			maximize(table);
			driver.get(url);
			Thread.sleep(10000);
		}
	}

	public void SendKeys(By locator, String keysToSend) {

		if(explicitWait(locator)) {
			if(isElementDisplayed(locator)) {
				test.log(LogStatus.INFO, "Sending data to following webElement:"+locator+" and data is:"+keysToSend);
				driver.findElement(locator).sendKeys(keysToSend);
			}
		
		}
	}

	public void click(By locator) {
		if(explicitWait(locator)) {
			if(isElementDisplayed(locator)) {
				test.log(LogStatus.INFO, "Clicking on following webElement:"+locator);
				driver.findElement(locator).click();
			}
		
		
		
		}
	}
	
	
	public List<WebElement> ListOfWebElement(By locator){
		
		System.out.println("This will return list of all the webelements");
		List<WebElement> allElem= driver.findElements(locator);
		test.log(LogStatus.INFO, "List of all webelement is:"+allElem);
		return allElem; 
		
	}

	public boolean isElementDisplayed(By locator) {
		boolean elementVisible=false; 
		if (explicitWait(locator)) {
			if (driver.findElement(locator).isDisplayed()) {
				elementVisible=true; 
				
				return elementVisible;
			} else {
				
				return elementVisible;
			}
		}
		return elementVisible;
		
	}

	public boolean explicitWait(By locator) {
		boolean flag = false;
		try {
			new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(locator));
			flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	public String getText(By locator) {
		String text = null;
		if(isElementDisplayed(locator)) {
			//test.log(LogStatus.INFO, "Getting text from following webelement:"+locator);
			 text=driver.findElement(locator).getText(); 
			 test.log(LogStatus.INFO, "text is :"+text);
		}
		return text;
	}
}
