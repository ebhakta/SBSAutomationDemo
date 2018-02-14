package com.sbs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sbs.qa.Testbase.TestBase;
import com.sbs.qa.pages.HomePage;
import com.sbs.qa.pages.OrderRental;
import com.sbs.qa.pages.RentalPage;

public class RentalPageTest extends TestBase {
	
	 HomePage homePage;
	 RentalPage rentalPage;
	 OrderRental orderRental;
	 
	public RentalPageTest(){
		super();
	}
	
	//test cases should be separated--independent with each orther
	//before each test case--launch the browser and login
	//@test--execute test case
	//after each test case--close the browser
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
		rentalPage = homePage.clickRentalpage();
	}
	
	@Test(priority=1)
	public void verifyRentalPageTitle(){
		String rentalPageTitle = rentalPage.verifyRentalPageTitle();
		Assert.assertEquals(rentalPageTitle, "Instrument Rental Rates – Spencer Brook Strings", "Rental Page title not match");
	}
	
	@Test(priority=2)
	public void verifyOrderRentalLink(){
		orderRental = rentalPage.clickOnOrderRentalLink();
		}
	
	@Test(priority=3)
	public void verifyRentalPagelable(){
		Assert.assertTrue(rentalPage.verifyRentalPageLabel());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
