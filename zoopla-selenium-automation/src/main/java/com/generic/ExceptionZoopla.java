package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExceptionZoopla {
public  WebDriver getLogout(WebDriver driver) {
	
	WebElement e = driver.findElement(By.xpath("//a[contains(@class, 'profile-link-label logout  uiOutputURL')]"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", e);
	return driver;
}
}
