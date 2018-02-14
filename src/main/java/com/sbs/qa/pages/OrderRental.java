package com.sbs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sbs.qa.Testbase.TestBase;

public class OrderRental extends TestBase {
	
	//page factory or object repo
	@FindBy(xpath=".//*[@id='PageContainer']/main/div[1]/div/nav/span[2]")
	WebElement orderRentalLabel;
	
	@FindBy(xpath=".//*[@id='259693_0']")
	WebElement violinSelected;
	
	@FindBy(xpath=".//*[@id='259693_1']")
	WebElement violaSelected;
	
	@FindBy(xpath=".//*[@id='259693_2']")
	WebElement celloSelected;
	
	@FindBy(xpath=".//*[@id='259693_3']")
	WebElement bassSelected;
	
	@FindBy(id="146824")
	WebElement childFirstName;
	
	@FindBy(id="223617")
	WebElement childLastName;
	
	@FindBy(id="146825")
	WebElement childGradeIs;
	
	@FindBy(id="146826")
	WebElement schoolsName;
	
	@FindBy(id="231082")
	WebElement teacherFirstName;
	
	@FindBy(id="231083")
	WebElement teacherLastName;
	
	@FindBy(id="231084")
	WebElement teacherEmailAdd;
	
	@FindBy(id = "AddToCart")
	WebElement orderNowBtn;

	
	
	//initialization
	public OrderRental(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyOrderRentalLabel(){
		return orderRentalLabel.isDisplayed();
	}
	
	public String verifyOrderPageTitle(){
		return driver.getTitle();	
	}
	
	public void selectInstrumentName(String rentalFor, String value, String size, String rest, String rentalType, String rentalPlan, String townName, 
			String childFN,String childLN, String childGrade,
			String schoolName, String teacherFName, String teacherLName, String teacherEmail) throws InterruptedException{
		//new org.openqa.selenium.support.ui.WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(((By.xpath("//input[@name='properties[Instrument]'][@value='"+value+"']")))));
		//driver.findElement(By.xpath("//input[@class='bold_option_child shappify_option_259693 condition_show conditional_logic_113378_show'][@value='"+value+"']")).click();
		
	
		//WebDriverWait wait = new WebDriverWait(driver, 100); 
		//wait.until(ExpectedConditions.presenceOfElementLocated(
				//(By.xpath("//input[@name='properties[Instrument]'][@value='"+value+"']"))));
		
		//driver.findElement(By.xpath("//input[@name='properties[Instrument]'][@value='"+value+"']")).click();
		//driver.findElement(By.xpath(".//*[@id='shapp_option_list_7940843846']/div[1]/div[2]/div[2]/label["+value+"]")).click();
		
		Select selectRental = new Select(driver.findElement(By.id("259692")));
		selectRental.selectByValue(rentalFor);
		
		Thread.sleep(4000);
			
		driver.findElement(By.xpath("//*[contains(@value,'"+value+"')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(@value,'"+size+"')]")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='259692']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@value, '"+rest+"')]")).click();
		Thread.sleep(2000);
		
		Select selectrentalType = new Select(driver.findElement(By.id("259696")));
		selectrentalType.selectByValue(rentalType);
		Thread.sleep(2000);
		Select selectrentalPlan = new Select(driver.findElement(By.id("259697")));
		selectrentalPlan.selectByValue(rentalPlan);
		Thread.sleep(2000);
		Select selecttownName = new Select(driver.findElement(By.id("146626")));
		selecttownName.selectByValue(townName);
		Thread.sleep(2000);
	
		childFirstName.sendKeys("childFN");
		childLastName.sendKeys("childLN");
		childGradeIs.sendKeys("childGrade");
		schoolsName.sendKeys("schoolName");
		teacherFirstName.sendKeys("teacherFName");
		teacherLastName.sendKeys("teacherLName");
		teacherEmailAdd.sendKeys("teacherEmail");
		
		orderNowBtn.click();
		/*
		System.out.println(rentalFor);
		System.out.println("----------------------------");
		System.out.println(value);
		System.out.println("----------------------------");
		System.out.println(size);
		System.out.println("----------------------------");
		System.out.println(rest);
		System.out.println(rentalType);
		System.out.println("----------------------------");
		System.out.println(rentalPlan);
		System.out.println("----------------------------");
		System.out.println(townName);
		System.out.println("----------------------------");
		System.out.println(childFN);
		System.out.println("----------------------------");
		System.out.println(childLN);
		System.out.println("----------------------------");
		System.out.println(childGrade);
		System.out.println("----------------------------");
		System.out.println(schoolName);
		System.out.println("----------------------------");
		System.out.println(teacherFName);
		System.out.println("----------------------------");
		System.out.println(teacherLName);
		System.out.println("----------------------------");
		System.out.println(teacherEmail);*/
	}   
	    
	    
	}


