package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.utility.ConfigFileZoopla;
import com.utility.Highlight;
import com.utility.ScreenShot;

public class BaseLogin {
	public void  getZoopla(WebDriver driver) {
		
		PageFactoryZoopla obj=new PageFactoryZoopla (driver);
		new Highlight().getColor(driver, obj.getSignin());
		new ScreenShot().getPicture(driver,"Before Singin");
		obj.getAcceptallcookies().click();
		obj.getSignin().click();
		new ScreenShot().getPicture(driver,"After Singin");
		new Highlight().getColor(driver, obj.getEmailAddress());
		obj.getEmailAddress().sendKeys(new ConfigFileZoopla().getConfigValue("User"));
		new Highlight().getColor(driver, obj.getPasswd());
		obj.getPasswd().sendKeys(new ConfigFileZoopla().getConfigValue("Passwd"));
		new Highlight().getColor(driver, obj.getLoginbt());
		new ScreenShot().getPicture(driver,"Before Login");
		obj.getLoginbt().click();
		new ScreenShot().getPicture(driver,"After Singin");
		new Highlight().getColor(driver, obj.getSingout());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions ac=new Actions(driver);
		ac.moveToElement(obj.getMyzoopla()).perform();
		//obj.getMyzoopla();
		if(obj.getSingout().isDisplayed()) {
			System.out.println("Test passed");
			Assert.assertTrue(obj.getSingout().isDisplayed());
		}else{
			System.out.println("Test False");
		}
		//obj.getSingout().click();
	
	}
}
