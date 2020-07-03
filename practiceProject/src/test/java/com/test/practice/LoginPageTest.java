package com.test.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.practice.TestBase;
import com.webpages.practice.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	public LoginPageTest() throws Exception
	{
	
		super();  // this constructor will call the parent constructor and will initialize all the elements defined in the constructor of parents class	
	}
	
	
	
	@BeforeMethod
	public void setupMethod() throws Exception
	{
		initialize();
		System.out.println("1  pass");
		loginpage = new LoginPage();
		
		 System.out.println(" 2 pass");
	}
	
	
	@Test
	public void Test_001_SelectDate()
	{
		
		loginpage.dayname().selectByValue("12");
		
		System.out.println(" date Value is selected");
	}
	
	
	@Test
	public void Test_002_SelectMonth()
	
	{
		
		loginpage.monthname().selectByValue("11");
		System.out.println(" Month Value is selected");
		
	}
	
	
	
	@Test
	public void Test_003_SelectYear()
	{
		
		loginpage.monthname().selectByValue("2018");
		System.out.println(" Year Value is selected");
		
	}
	

	
	@AfterMethod
	public void tearDownMethod()
	{
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
