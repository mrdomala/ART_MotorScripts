package com.art.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download_Policy_Certificate {
	WebDriver driver;

	// WebElement
	@FindBy(xpath = "//*[@id='nav-home']/app-allpolicies/div[1]/div[2]/div[2]/div[1]/div/div[2]")
	public WebElement Click3Dots;
	
	@FindBy(xpath = "//*[@id=\"nav-home\"]/app-allpolicies/div[1]/div[2]/div[2]/div[1]/div/div[3]/a[2]")
	public WebElement Download_Policy;

	// Constructor
	public Download_Policy_Certificate(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	// Page Objects (For Exception Cases)

}
