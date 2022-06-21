package com.art.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.art.runner.CucumberRunner;
import com.art.utility.SendEmail;

import io.cucumber.java.en.Then;

public class Send_Email_SD {

	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	@Then("report is sent to mail")
	public void report_is_sent_to_mail() throws InterruptedException {
		Thread.sleep(10000);
		SendEmail.main(null);
		log.info("Report is sent sucessfully to email");
	}

}
