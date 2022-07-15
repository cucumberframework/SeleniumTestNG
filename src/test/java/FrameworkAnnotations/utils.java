package FrameworkAnnotations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class utils extends FrameworkAnnotations {

	public void maximize() {
		if (driver != null) {
			driver.manage().window().maximize();
		}
	}

	public void navigate(String url) {
		if (driver != null) {
			driver.get(url);
		}
	}

	public void SendKeys(By locator, String keysToSend) {

		if(explicitWait(locator)) {
		driver.findElement(locator).sendKeys(keysToSend);
		}
	}

	public void click(By locator) {
		if(explicitWait(locator)) {
		driver.findElement(locator).click();
		
		
		}
	}
	
	
	public List<WebElement> ListOfWebElement(By locator){
		
		System.out.println("This will return list of all the webelements");
		
		return null; 
		
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
			 text=driver.findElement(locator).getText(); 
		}
		return text;
	}
}
