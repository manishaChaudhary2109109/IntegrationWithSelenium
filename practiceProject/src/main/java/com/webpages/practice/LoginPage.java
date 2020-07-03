package com.webpages.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.practice.TestBase;

public class LoginPage  extends TestBase{
	
		// We are creating an object repository over here
	//dropdown for day
	@FindBy(xpath = "//select[@name='birthday_day' and @id='day']")
	WebElement day;
	
	
    //dropdown for month
	@FindBy(xpath = "//select[@name='birthday_month' and @id='month']")
	WebElement month;
	
	
	//dropdown for year 
	@FindBy(xpath = "//select[@name='birthday_year' and @id='year']")
	WebElement year;
	
	
	public LoginPage() throws Exception {
		PageFactory.initElements(driver, this); // we will initialize all the web elements using page factory approach. 
		//the driver word used over here is coming from the base class and this keyword is used instead of LoginPage.class.
		//Actually this key word is  
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Select dayname(){
		
		// As we are working on the dropdown
	
		 return new Select(day);
	
	}
	
	
public Select monthname(){
		
		// As we are working on the dropdown
	
		 return new Select(month);
	
	}



public Select yearname(){
	
	// As we are working on the dropdown

	 return new Select(year);

}








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
