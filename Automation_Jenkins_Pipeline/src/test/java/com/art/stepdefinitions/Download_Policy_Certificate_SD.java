package com.art.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.art.runner.CucumberRunner;
import com.art.testcontext.StepData;
import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.java.en.Then;

public class Download_Policy_Certificate_SD extends StepData {
	static WebDriver driver;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	private StepData stepData;
	public Download_Policy_Certificate_SD(StepData stepData) {
		this.stepData = stepData;
	}


	@Then("User clicks on {int} dots for policy")
	public void user_clicks_on_dots_for_policy(Integer int1) throws InterruptedException {
		log.info("<---------------------------------Download Policy Certificate-------------------------------->");
		stepData.commonMethods();
		Thread.sleep(3000);
		stepData.getCm().genericJSE(stepData.getDriver(),stepData.getDpc().Click3Dots);
		log.info("Clicked the 3 dots");
	    
	}
	@Then("click on Download policy Certificate in English")
	public void click_on_download_policy_certificate_in_english() throws InterruptedException {
		Thread.sleep(2000);
		stepData.getCm().genericJSE(stepData.getDriver(),stepData.getDpc().Download_Policy);
		log.info("Clicked Download Policy Certificate in EN");
		Thread.sleep(3000);
		log.info("Policy Downloaded successfully");
	    
	    
	}

}
