package com.packt.webdriver.chapter1;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class dropdownlist {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:/Users/vgollak/AppData/Roaming/npm/node_modules/protractor/node_modules/webdriver-manager/selenium/chromedriver_2.38.exe"); 
		Map capabilitiesMap=new HashMap();
		capabilitiesMap.put("takeScreenShot", true);
		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
		WebDriver driver=new ChromeDriver();
	    driver.get("https://accounts.google.com");
	    driver.manage().window().maximize();
	    
	    System.out.println("Sample Jenkins POC done");
	    System.out.println("POC on GIT and Maven and JENKINS");
	    System.out.println("Vamsi Gollakota Jenkins test123431");
	    
	    
}
}
