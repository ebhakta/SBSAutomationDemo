package com.sbs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sbs.qa.Testbase.TestBase;
import com.sbs.qa.pages.HomePage;
import com.sbs.qa.pages.OrderRental;
import com.sbs.qa.pages.RentalPage;
import com.sbs.qa.util.TestUtil;

public class OrderRentalTest extends TestBase {

	HomePage homePage;
	RentalPage rentalPage;
	OrderRental orderRental;
	String sheetName="Orders";
	
	public OrderRentalTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
		rentalPage = homePage.clickRentalpage();
		orderRental = rentalPage.clickOnOrderRentalLink();
		
	}
	
	@Test(priority=1)
	public void verifyOrderRentalTitle(){
		String orderPageTitle = rentalPage.verifyRentalPageTitle();
		Assert.assertEquals(orderPageTitle, "Order a Rental – Spencer Brook Strings", "Title didn't match");
	}
	
	@Test(priority=2)
	public void verifyOrderRentalLabel(){
		Assert.assertEquals(rentalPage.verifyRentalPageLabel(), "Order a rental label is missing on the page");
	}
	
	
	@DataProvider
	public Object[][] getTestData(){
		 Object data[][] = TestUtil.getTestData(sheetName);
		 return data;
		 
	}
	
	@Test(priority=3, dataProvider = "getTestData")
	public void selectInstrumentTypeTest(String rentalFor, String value, String size, String rest, String rentalType, String rentalPlan, String townName, String childFN,String childLN, String childGrade, String schoolName, String teacherFName, String teacherLName, String teacherEmail) throws InterruptedException
	{
		orderRental.selectInstrumentName(rentalFor, value, size, rest, rentalType, rentalPlan, townName, childFN, childLN, childGrade, schoolName, teacherFName, teacherLName, teacherEmail);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
