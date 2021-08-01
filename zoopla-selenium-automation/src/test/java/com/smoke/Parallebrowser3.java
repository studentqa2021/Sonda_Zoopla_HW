package com.smoke;

import org.testng.annotations.Test;

import com.practice.TestingCrossbrower;

public class Parallebrowser3 {

	
	@Test
	public void getTest() {
		new TestingCrossbrower().getBrowser("chrome");		
	}
}
