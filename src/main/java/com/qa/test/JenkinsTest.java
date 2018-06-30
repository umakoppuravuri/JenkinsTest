package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JenkinsTest {

	WebDriver driver;
	
	@Test
	public void Testcase(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum of :"+ c);
	}
}
