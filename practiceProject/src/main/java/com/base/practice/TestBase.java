package com.base.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.testUtility.practice.TestUtility;

public class TestBase {
	
	
	public static Properties prop;
	public static WebDriver driver;

	public TestBase() throws Exception
	{
		
		
		 prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("D:\\workspace\\practice projects\\practiceProject\\src\\main\\java\\com\\config\\practice\\configuration.properties");		
			prop.load(ip);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
	

public static void initialize(){
	
	
		String browser= prop.getProperty("browser");
		
		if(browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manisha\\Desktop\\chromedriver.exe");
			
			
			driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			
			
			
			
		}
			else if(browser.equals("firefox"))
			{
				
				
				driver = new FirefoxDriver();
				
			
			}
			
			else 
				
				
				{
				System.out.println("nothing selected");
				}
		
		    driver.manage().window().maximize();
		    driver.manage().timeouts().pageLoadTimeout(TestUtility.pageload_time, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(TestUtility.implicit_time, TimeUnit.SECONDS);
		    
		
		  //  String url = prop.getProperty("url");
		    //driver.get("url");
	
								}	
	
	
	
}
