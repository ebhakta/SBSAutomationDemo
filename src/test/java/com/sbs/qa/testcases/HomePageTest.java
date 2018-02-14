package com.sbs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sbs.qa.Testbase.TestBase;
import com.sbs.qa.pages.HomePage;
import com.sbs.qa.pages.RentalPage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	RentalPage rentalPage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void homePageTitleTest(){
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Spencer Prook Strings", "Title not correct");
		}
	
	@Test(priority = 2)
	public void sbsLogoTest(){
		boolean flag = homePage.validateSBSImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void rentalsPageLinkTest(){
		rentalPage = homePage.clickRentalpage();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
