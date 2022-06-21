package com.art.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download_Ecard {
	WebDriver driver;

	// WebElement
	@FindBy(xpath = "//*[@id='nav-home']/app-allpolicies/div[1]/div[2]/div[2]/div[1]/div/div[2]")
	public WebElement Click3Dots;
	
	@FindBy(xpath = "//*[@id=\"nav-home\"]/app-allpolicies/div[1]/div[2]/div[2]/div[1]/div/div[3]/a[1]")
	public WebElement Download_Ecard;
	
	@FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div[contains(text(), \" Download eCard as PDF \" )]")
	public WebElement Download_Ecard_Pdf;

	// Constructor
	public Download_Ecard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Page Objects (For Exception Cases)

}