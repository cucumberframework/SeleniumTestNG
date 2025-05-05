package Web.SeleniumTestNG;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WindowHandles {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
				///Users/rahulbarapatre/git/SeleniumTestNG/drivers/chromedriver.exe
				//"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicite wait implementation
		driver.get("https://www.naukri.com");
		String parentWin= driver.getWindowHandle(); 
		System.out.println(parentWin);
		driver.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//div[@class='qsbSubmit']")).click();
		
		List<WebElement> allElem= driver.findElements(By.xpath("//a[@class='title fw500 ellipsis']")); 
		for(WebElement elem:allElem) {
			 elem.click();
		}
		
		Set<String> allChild= driver.getWindowHandles(); 
		Iterator<String> it= allChild.iterator();
		while(it.hasNext()) {
			String childWin=it.next(); 
			if(!parentWin.equals(childWin)) {
				driver.switchTo().window(it.next());
				//System.out.println(driver.switchTo().window(childWin).getTitle());
		String compName=driver.findElement(By.xpath("//div[@class='jd-header-comp-name']")).getText(); 
		System.out.println(compName);
			
			}
			
			
			
		}
		
		
		
		
		
}
}


























