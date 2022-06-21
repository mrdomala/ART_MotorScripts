package com.art.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Verification {
	WebDriver driver;
	
	//WebElement
	@FindBy(xpath = "//*[@id='navbar2']/nav/ul/li[2]/a")
	public WebElement MyQuotaion;
	
	@FindBy(xpath = "//*[@id = 'nav-home-tab']")
	public WebElement AllPolicies;
	
	@FindBy(xpath = "//div[contains(text(), \"Policy No. P1021-MTI-INWS-02283527 \")]")
	public WebElement MotorPolicy;
	
	
	
    //Constructor 
	public Dashboard_Verification(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	//Page Objects (For Exception Cases)

}

