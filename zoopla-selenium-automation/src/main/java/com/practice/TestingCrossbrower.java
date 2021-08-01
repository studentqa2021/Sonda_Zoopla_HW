package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestingCrossbrower {
public void getBrowser(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("open the browser="+browser);
		driver.quit();
	}
	
	
	else if(browser.equalsIgnoreCase("ie")) {
	System.setProperty("webdriver.ie.driver","./Driver/IEDriverServer.exe");
    WebDriver driver1 = new InternetExplorerDriver();
	driver1.get("https://www.amazon.com/");
	System.out.println("open the browser="+browser);
	System.exit(0);
	}
	else if(browser.equalsIgnoreCase("firefox")) {
	System.out.println("open the browser="+browser);	
	
	}else {
		
	System.out.println("Not found any browser");
	}
	
}

public static void main(String[] args) {
	new TestingCrossbrower().getBrowser("chrome");
	new TestingCrossbrower().getBrowser("chrome");
	new TestingCrossbrower().getBrowser("chrome");
	}
}

