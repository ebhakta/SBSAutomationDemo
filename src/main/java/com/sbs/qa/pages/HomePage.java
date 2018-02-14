package com.sbs.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sbs.qa.Testbase.TestBase;

public class HomePage extends TestBase {
	
	//page Factory--Object Repository
	
	@FindBy(xpath = ".//*[@id='AccessibleNav']/li[2]/a")
	WebElement rentalspage;
	
	@FindBy(xpath = ".//*[@id='PageContainer']/div/header/div/div/div[2]/div[1]/a/img")
	WebElement sbslogo;
	
	//object initialization
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);//this means pointing to current class object
			}
	//Actions:
	public RentalPage clickRentalpage(){
		rentalspage.click();
		
		return new RentalPage();//Rental page is the landing page for homepage
			}
	
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateSBSImage(){
		return sbslogo.isDisplayed();
	}
	 
}
