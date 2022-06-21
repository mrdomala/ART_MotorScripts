package com.art.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Motor_Logged_CustomNo {
	WebDriver driver;

	// WebElement
	@FindBy(xpath = "//*[@id=\' dropdownMenuButton\']/img")
	public WebElement Dropdown;
	
	@FindBy(xpath = "//*[@id=\'navbarNav\']/ul/li[1]/div/div[13]/span")
	public WebElement Motor;
	
	@FindBy(xpath = "//*[@id=\"aligmentReset\"]/div/div[1]/section/main/div/div/div/app-motor-quote/div/div/section/main/form/div[2]/div[3]/div/p")
	public WebElement CustomFlow;
	
	@FindBy(xpath = "//*[@id=\'txtContactMobileNumber\']")
	public WebElement MobileNo;
	
	@FindBy(xpath = "//*[@id=\'emailAddress\']")
	public WebElement Email;
	
	@FindBy(xpath = "//*[@id=\'txtCustomNumber\']")
	public WebElement CustomNumber;
	
	@FindBy(xpath = "//*[@placeholder='Enter Year']")
	public WebElement Year;	
	
	@FindBy(xpath = "//*[@type='checkbox']")
	public WebElement Checkbox;
	
	@FindBy(xpath = "//button[contains(text(),'Get a Quote')]")
	public WebElement Quote;
	
	@FindBy(xpath = "/html/body/app-root/div/mat-drawer-container/mat-drawer-content/app-motor-purchase-revamp/div/div/app-stepper/section/app-motor-revamp-premium/div/div[6]/app-product-card[1]/div/div/div[2]/div[2]/button")
	public WebElement TPL;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	public WebElement Proceed;
	
	@FindBy(xpath = "//input[1]")
	public WebElement OTP_0;

	@FindBy(xpath = "//input[2]")
	public WebElement OTP_1;

	@FindBy(xpath = "//input[3]")
	public WebElement OTP_2;

	@FindBy(xpath = "//input[4]")
	public WebElement OTP_3;

	@FindBy(xpath = "//*[@id='Submit-btn']")
	public WebElement Submit;
	
	@FindBy(xpath = "//*[@class='visa-icon']")
	public WebElement Debit_card;
	
	@FindBy(xpath = "//button[contains(text(),'Confirm and Pay')]")
	public WebElement Confirm_Pay;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-payment-integration[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/iframe[1]")
	public WebElement CardNo;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-payment-integration[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")
	public WebElement Expiry_date;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-payment-integration[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[2]/input[1]")
	public WebElement CardHolderName;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-payment-integration[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[2]/iframe[1]")
	public WebElement CVV;
	
	@FindBy(xpath = "//button[contains(text(),'Pay now')]")
	public WebElement PayNow;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-payment-integration[1]/div[1]/div[1]/div[1]/form[1]")
	public WebElement Success_Pay;
	
	// Constructor
	public Motor_Logged_CustomNo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Page Objects (For Exception Cases)

}
