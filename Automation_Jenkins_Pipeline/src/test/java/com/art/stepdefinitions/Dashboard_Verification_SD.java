package com.art.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.art.runner.CucumberRunner;
import com.art.testcontext.StepData;
import com.relevantcodes.extentreports.ExtentReports;
import io.cucumber.java.en.Then;

public class Dashboard_Verification_SD extends StepData {
	static WebDriver driver;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	private StepData stepData;

	public Dashboard_Verification_SD(StepData stepData) {
		this.stepData = stepData;

	}

	@Then("Verify the header with {string}")
	public void verify_the_header_with(String HeaderExpected) throws InterruptedException {
		log.info("<---------------------------------Dashboard Verification-------------------------------->");
		stepData.commonMethods();
		Thread.sleep(4000);
		stepData.getCm().genericVerifyElement(stepData.getDv().MyQuotaion, HeaderExpected);
		log.info("Verified Header at dashboard");

	}

	@Then("Verify All policy Text with {string}")
	public void verify_all_policy_text_with(String AllPoliciesExpected) throws InterruptedException {
		Thread.sleep(4000);
		stepData.getCm().genericVerifyElement(stepData.getDv().AllPolicies, AllPoliciesExpected);
		log.info("Verified AllPolicies at dashboard");
	}

	@Then("Verify the Motor Policy {string}")
	public void verify_the_motor_policy(String MotorPolicyExpected) throws InterruptedException {
		Thread.sleep(3000);
		stepData.getCm().genericVerifyElement(stepData.getDv().MotorPolicy, MotorPolicyExpected);
		log.info("Verified MotorPolicy at dashboard");
	}

}
