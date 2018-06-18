package com.packt.webdriver.chapter1;



import java.beans.Transient;
import java.io.File;
import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.http.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyUpAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateToAUrl {
	
	

	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:/Users/vgollak/AppData/Roaming/npm/node_modules/protractor/node_modules/webdriver-manager/selenium/chromedriver_2.38.exe"); 
		Map capabilitiesMap=new HashMap();
		capabilitiesMap.put("takeScreenShot", true);
		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	   // driver.findElement(By.name("q")).sendKeys("Vamsi");
	    //Actions builder=new Actions(driver);
	    //builder.keyDown(Keys.DOWN);
	    Thread.interrupted();
	    Thread.sleep(2000);
	    WebDriverWait wait=new WebDriverWait(driver, 10);
	    driver.findElement(By.name("q")).sendKeys("Multi Window");
	    driver.manage().deleteAllCookies();
	    final int i;//blank final variable
        WebElement searchBox = driver.findElement(By.name("btnK"));
	    driver.findElement(By.xpath("//a[text()='Multi-Window Support | Android Developers']")).click();
	    Thread.sleep(2000);
	    Runtime.getRuntime();
	    
	    driver.findElement(By.xpath("//a[text()='Start survey']")).click();
	    

	    //String window1=driver1.getWindowHandle();
	  
	   /* 
		try{ 
 			// down casting WebDriver to use getScreenshotAs method. 
			TakesScreenshot ts= (TakesScreenshot)driver; 
 			// capturing screen shot as output type file 
 			//File screenshotSRC= ts.getScreenshotAs(OutputType.FILE); 
 			// Defining path and extension of image 
			

	   if(searchBox.isDisplayed())
	    {
	    System.out.println("SearchBox is displayed.");
	    searchBox.isEnabled();
	    System.out.println("SearchBox is enabled.");
	    searchBox.click();
	    System.out.println("SearchBox is clicked.");
	       
	    }
	    else{
	    	System.out.println("SearchBox is not sellected.");
	    }
	    
	    String testStepsName = null;
	    File screenshotSRC= ts.getScreenshotAs(OutputType.FILE); 
		String path=System.getProperty("user.dir")+"/screenshots/"+testStepsName+System.currentTimeMillis()+".png"; 
		// copying file from temp folder to desired location 
		File screenshotDest= new File(path); 
			FileUtils.copyFile(screenshotSRC, screenshotDest); 
			System.out.println("Captured Screen Shot");
		return;
	}catch(Exception e) 
	{ 
		System.out.println("Some exception occured." + e.getMessage()); 
		return;
	}
	   */
	   
	   // WebDriver driver1=new FirefoxDriver(capabilities);

	    
	    /* List<WebElement> Elements=driver.findElements(By.xpath(""));
	    System.out.println(Elements.size());
	    
	    WebElement element=driver.findElement(By.xpath(""));
	    element.click();
	    element.isSelected();
	    element.isDisplayed();
	    element.isDisplayed();
	    String str=driver.getTitle();
	    String pagesource=driver.getPageSource();
	    driver.getCurrentUrl();
	    element.isDisplayed();
	    
	    Select s=new Select(driver.findElement(By.xpath("")));
	    s.selectByValue("HELLO");
	    s.selectByIndex(1);
	    s.selectByVisibleText("INDIA");
	    
	    driver.navigate().forward();
	    driver.navigate().back();
	    driver.navigate().refresh();
	    driver.navigate().to("www.google.com");
	    
	    driver.findElement(By.linkText("Signin")).click();
	    
	    //Asserts.assertEquals("Gooooogle", driver.getTitle());

WebElement element=driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);

WebElement element=driver.findElement(By.xpath("")).clear();
element.submit();
	   
	    
	    Actions builder=new Actions(driver);
	    builder.keyDown(Keys.CONTROL);
	    WebElement one = null;
		builder.click(one);
	    WebElement two = null;
		builder.click(two);
	  builder.keyUp(Keys.CONTROL);
	  builder.clickAndHold();
	  builder.moveByOffset(120, 100);
	  builder.release(two);
	  builder.perform();
	  Action a=builder.build();
	  a.perform();
	  builder.dragAndDropBy(one, 300, 200).perform();
	  builder.doubleClick().perform();
	  builder.contextClick(two);
	  builder.click(driver.findElement(By.xpath("Item4")));
	  builder.perform();
	  
	   */
	  
	    
		
	}
}

