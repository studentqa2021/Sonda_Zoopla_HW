package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryZoopla {
	//WebDriver driver;
	public PageFactoryZoopla(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
//	@FindBy(xpath="(//*[contains(text(),'Accept all cookies')])[2]")
	//private WebElement acceptallcookies; 
	
	@FindBy(xpath="(//*[contains(@class,'css-1rwrl3a e1niaah1')])[1] ")
	private WebElement signin;

	@FindBy(xpath="//*[contains(@id,'input-email-address')]")
	private WebElement emailAddress;
	
	@FindBy(xpath="//*[contains(@id,'input-password')]")
	private WebElement passwd;
	
	@FindBy(xpath="(//*[contains(text(),'Sign in')])[10]")
	private WebElement loginbt;
	
	@FindBy(xpath="//*[contains(@class,'css-18ufi8 e1niaah3')][1]")
	private WebElement myzoopla;
	
	
	
	@FindBy(xpath="(//*[contains(@class,'esdwd6d0 css-wxwl91-StyledLink-Link e33dvwd0')])[5]")
	private WebElement singout;

	//public WebElement getAcceptallcookies() {
		//return acceptallcookies;
	//}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLoginbt() {
		return loginbt;
	}

	public WebElement getMyzoopla() {
		return myzoopla;
	}

	public WebElement getSingout() {
		return singout;
	}

	
	
	
}
