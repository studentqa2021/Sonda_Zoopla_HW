package com.smoke;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.practice.TestingCrossbrower;

public class TestNGcrossBrowsertesting {

	
	@BeforeTest
	public void getSetup() {
		
	}
	
	@Test
	@Parameters("browser")
	public void getTest(String browser) {
	new TestingCrossbrower().getBrowser(browser);	
	}
	@AfterTest
	public void tearDown() {
		
	}
}
