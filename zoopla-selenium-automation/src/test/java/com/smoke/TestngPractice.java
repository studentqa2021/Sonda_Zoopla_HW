package com.smoke;

import org.testng.annotations.Test;

public class TestngPractice {
@Test(groups= {"Smoke"})

public void logIn() {
	System.out.println("Login");	
}

@Test(groups= {"Functional Test"})
public void dress() {
	System.out.println("Drees");
}
@Test(groups= {"Regression"})
public void cart() {
System.out.println("Cart");	
}
@Test(groups= {"Regression"})
public void menShirt(){
System.out.println("Menshirt");	
}
}
