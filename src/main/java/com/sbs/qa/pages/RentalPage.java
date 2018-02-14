package com.sbs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sbs.qa.Testbase.TestBase;

public class RentalPage extends TestBase {
	
	@FindBy(xpath= ".//*[@id='PageContainer']/main/div[1]/div/nav/span[2]")
	WebElement instrumentRatesLabel;
	
	@FindBy(xpath = ".//*[@id='PageContainer']/main/div[1]/div/div/div/div/div/div[5]/div/div/div/div/a[1]")
	WebElement orderRentalLink;
	
	@FindBy(xpath = ".//*[@id='PageContainer']/main/div[1]/div/div/div/div/div/div[5]/div/div/div/div/a[2]")
	WebElement emailUsLink;
	
	//Initializing the Page Object
	
	public RentalPage(){
		PageFactory.initElements(driver,this);
	}
	
	public String verifyRentalPageTitle(){
		return driver.getTitle();	
	}
	
	public OrderRental clickOnOrderRentalLink(){ //landing page is Order Rental
		orderRentalLink.click();
		return new OrderRental();
	}
	
	public boolean verifyRentalPageLabel(){
		return instrumentRatesLabel.isDisplayed();
		
	}
}
