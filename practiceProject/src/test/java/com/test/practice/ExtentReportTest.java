package com.test.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTest {
	
	
	public  ExtentHtmlReporter htmlReport;
	public  ExtentReports extent;
	
	@BeforeSuite
	public void setupMethod()
	{
	htmlReport = new ExtentHtmlReporter("D:\\workspace\\practice projects\\practiceProject\\ExtentFileReport123\\reports.txt");
	extent = new ExtentReports();
	extent.attachReporter(htmlReport);
	}
	
	
	@Test
	public void Test1()
	{
		ExtentTest test = extent.createTest("This is the first Test");
		
		test.info("Verfification id going on");
		test.debug("we are debugging");
		test.pass("The test case is pass");
		
	}
	
	@Test
	public void Test2()
	{
		ExtentTest test = extent.createTest("This is the second Test");
		
		test.info("Verfification id going on");
		test.debug("we are debugging");
		test.fail("The test case is pass");
	
	}
	
	
	
	
	
	
	@AfterSuite
	public void TearDownMethod()
	{
		extent.flush();
		
	}
	
	
	

}
