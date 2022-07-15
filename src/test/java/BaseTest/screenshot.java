package BaseTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import FrameworkAnnotations.FrameworkAnnotations;

public  class screenshot {
	public static File destFile; 
	
public static String destinationFileName; 
	//Create unique name for file 
public static void takeScreenshot() throws IOException { 
	
Date ds = new Date(); 
String sourceName= ds.toString().replace(":", "_").replace(" ", "_");

//Take screenshot 
TakesScreenshot ts=(TakesScreenshot)FrameworkAnnotations.driver; 

File source= ts.getScreenshotAs(OutputType.FILE); 
destinationFileName= System.getProperty("user.dir")+"//ScreenshotsFolder//"+sourceName+".png"; 
destFile= new File(destinationFileName); 
FileUtils.copyFile(source, destFile);
}
}