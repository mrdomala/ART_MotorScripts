package com.art.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.art.runner.CucumberRunner;
import com.art.testcontext.StepData;
import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.java.en.Then;

public class Download_Ecard_SD extends StepData {
	static WebDriver driver;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	private StepData stepData;

	public Download_Ecard_SD(StepData stepData) {
		this.stepData = stepData;
	}

	@Then("User clicks on {int} dots for Ecards")
	public void user_clicks_on_dots_for_ecards(Integer int1) throws InterruptedException {
		log.info("<---------------------------------Download Ecard-------------------------------->");
		stepData.commonMethods();
		Thread.sleep(3000);
		stepData.getCm().genericJSE(stepData.getDriver(), stepData.getDe().Click3Dots);
		log.info("Clicked the 3 dots");
	}

	@Then("click on Download ecard")
	public void click_on_download_ecard() throws InterruptedException {
		Thread.sleep(2000);
		stepData.getCm().genericJSE(stepData.getDriver(), stepData.getDe().Download_Ecard);
		log.info("Clicked Download Ecard");
		Thread.sleep(10000);

	}

	@Then("Click on Download Ecard PDF")
	public void click_on_download_ecard_pdf() throws InterruptedException {
		stepData.getCm().genericJSE(stepData.getDriver(), stepData.getDe().Download_Ecard_Pdf);
		log.info("Clicked Download Ecard as Pdf");
		Thread.sleep(10000);
		log.info("Ecard Downloaded successfully in PDF format");

	}

}
