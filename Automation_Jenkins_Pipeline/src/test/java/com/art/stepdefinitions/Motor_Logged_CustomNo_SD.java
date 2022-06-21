package com.art.stepdefinitions;

import java.util.List;
import java.util.Map;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.art.pages.Common_Methods;
import com.art.pages.Motor_Logged_CustomNo;
import com.art.runner.CucumberRunner;
import com.art.testcontext.StepData;
import com.relevantcodes.extentreports.ExtentReports;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Motor_Logged_CustomNo_SD {

	static WebDriver driver;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());
	Motor_Logged_CustomNo Motor_Logged_CustomNo;
	Common_Methods cm;
	Motor_Logged_CustomNo_SD MLC;

	private StepData stepData;

	public Motor_Logged_CustomNo_SD(StepData stepData) {
		this.stepData = stepData;

	}

	@When("^User clicks on Our Products dropdowns$")
	public void user_clicks_on_our_products_dropdowns() throws Throwable {
		log.info("<---------------------------------Motor Logged Custom No. Flow-------------------------------->");
		stepData.commonMethods();
		log.info("About to click dropdown!");
		Thread.sleep(60000);
		stepData.getCm().genericClick(stepData.getMCF().Dropdown);
		log.info("Clicked on dropdown of Our Products");
	}

	@Then("^Click on Motor$")
	public void click_on_motor() throws Throwable {
		Thread.sleep(5000);
		stepData.getCm().genericClick(stepData.getMCF().Motor);
		log.info("Clicked on motor");
		Thread.sleep(3000);
	}

	@Then("^Clcik on Custom Number$")
	public void clcik_on_custom_number() throws Throwable {
		Thread.sleep(10000);
		stepData.getCm().genericJSE(stepData.getDriver(), stepData.getMCF().CustomFlow);
		log.info("Moved to custom flow");
	}

	@And("^User enter MobileNo$")
	public void user_enter_mobileno(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(1000);
			stepData.getCm().genericSendKeys(stepData.getMCF().MobileNo, mapdata.get("MobileNo"));
			log.info("User entered the MobileNo.");
		}
	}

	@Then("^User enter EmailId$")
	public void user_enter_emailid(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(1000);
			stepData.getCm().genericSendKeys(stepData.getMCF().Email, mapdata.get("EmailId"));
			log.info("User entered the EmailId");
		}
	}

	@Then("^User enter CustomNo$")
	public void user_enter_customno(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(1000);
			stepData.getCm().genericSendKeys(stepData.getMCF().CustomNumber, mapdata.get("CustomNo"));
			log.info("User entered the CustomNo");
		}
	}

	@Then("^User enter Year$")
	public void user_enter_year(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(1000);
			stepData.getCm().genericSendKeys(stepData.getMCF().Year, mapdata.get("Year"));
			log.info("User entered the Year");
			Thread.sleep(60000);
			log.info("Waiting for next 1min!");
		}
	}

	@And("^User clicks on checkbox$")
	public void user_clicks_on_checkbox() throws Throwable {
		Thread.sleep(60000);
		stepData.getCm().genericClick(stepData.getMCF().Checkbox);
		log.info("Click on check box");
	}

	@And("^User clicks on Insure now$")
	public void user_clicks_on_insure_now() throws Throwable {
		stepData.getCm().genericClick(stepData.getMCF().Quote);
		log.info("Clciked on Insure now");
		Thread.sleep(100000);
		log.info("Redirecting to premium page!!!");
	}

	@Then("^User selects on TPL$")
	public void User_selects_on_TPL() throws Throwable {
		stepData.commonMethods();
		Thread.sleep(40000);
		stepData.getCm().genericJSE(stepData.getDriver(), stepData.getMCF().TPL);
		log.info("User selected TPL flow");
	}

	@Then("^User clicks on proceed$")
	public void User_clicks_on_proceed() throws Throwable {
		Thread.sleep(40000);
		stepData.getCm().genericClick(stepData.getMCF().Proceed);
		log.info("Selected premium and move to proceed!");
	}

	@Then("User enters otp_0")
	public void user_enters_otp0(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(15000);
			log.info("in loop OTP_0");
			Thread.sleep(5000);
			stepData.getCm().genericSendKeys(stepData.getMCF().OTP_0, mapdata.get("otp_0"));
			log.info("User entered the static otp_0 text block as : 1");
		}
	}

	@Then("User enters otp_1")
	public void user_enters_otp1(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_1");
			Thread.sleep(7000);
			stepData.getCm().genericSendKeys(stepData.getMCF().OTP_1, mapdata.get("otp_1"));
			log.info("User entered the static otp_0 text block as : 1");
		}
	}

	@Then("User enters otp_2")
	public void user_enters_otp2(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_2");
			Thread.sleep(7000);
			stepData.getCm().genericSendKeys(stepData.getMCF().OTP_2, mapdata.get("otp_2"));
			log.info("User entered the static otp_0 text block as : 1");
		}
	}

	@Then("User enters otp_3")
	public void user_enters_otp3(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_3");
			Thread.sleep(7000);
			stepData.getCm().genericSendKeys(stepData.getMCF().OTP_3, mapdata.get("otp_3"));
			log.info("User entered the static otp_0 text block as : 1");
		}
	}

	@Then("User clicks on Submit")
	public void User_clicks_on_submit() throws InterruptedException {
		Thread.sleep(7000);
		log.info("waiting for submit!");
		stepData.getCm().genericClickEnter(stepData.getMCF().Submit);
		log.info("Waiting for loading payment page");
		Thread.sleep(15000);
		log.info("landed on payment page!");
	}

	@Then("^User clicks on credit card$")
	public void User_clicks_on_credit_card() throws Throwable {
		stepData.getCm().genericJSE(stepData.getDriver(), stepData.getMCF().Debit_card);
		Thread.sleep(10000);
		log.info("Selected payment method as debit card!");

	}

	@And("^User clicks on confirm and pay$")
	public void user_clicks_on_confirm_and_pay() throws Throwable {
		Thread.sleep(7000);
		log.info("waiting for landing on debit card payment page!");
		stepData.getCm().genericClickEnter(stepData.getMCF().Confirm_Pay);
		log.info("Waiting for loading payment page");
		Thread.sleep(15000);
		log.info("landed on payment page!");
	}

	@Then("^User enters cardNumber$")
	public void user_enters_cardnumber(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("User about to enter Debit card details-- CardNumber!");
			Thread.sleep(7000);
			stepData.getCm().genericSendKeys(stepData.getMCF().CardNo, mapdata.get("cardNumber"));
			log.info("User entered the card holder number");
		}
	}

	@Then("^User enters expiryDate$")
	public void user_enters_expirydate(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("User about to enter ExpiryDate");
			Thread.sleep(7000);
			stepData.getCm().genericSendKeys(stepData.getMCF().Expiry_date, mapdata.get("ExpiryDate"));
			log.info("User entered the ExpiryDate");
		}
	}

	@Then("^User enters cardHolder$")
	public void user_enters_cardholder(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("User about to enter card holder name");
			Thread.sleep(7000);
			stepData.getCm().genericSendKeys(stepData.getMCF().CardHolderName, mapdata.get("cardHolder"));
			log.info("User entered the cardholder name");
		}
	}

	@Then("^User enters CVV$")
	public void user_enters_cvv(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("User about to enter CVV");
			Thread.sleep(7000);
			stepData.getCm().genericSendKeys(stepData.getMCF().CVV, mapdata.get("CVV"));
			log.info("User entered CVV!");
		}
	}

	@And("^User clicks on PayNow$")
	public void user_clicks_on_paynow() throws Throwable {
		Thread.sleep(7000);
		log.info("waiting for Paynow!");
		stepData.getCm().genericClickEnter(stepData.getMCF().PayNow);
		log.info("Waiting for loading payment page");
		Thread.sleep(15000);
		log.info("landed on payment page!");
	}

	@Then("^User clicks on Success_Pay$")
	public void user_clicks_on_successpay() throws Throwable {
		Thread.sleep(7000);
		log.info("waiting for Success_Pay in 2nd Screen!");
		stepData.getCm().genericClickEnter(stepData.getMCF().Success_Pay);
		log.info("Success_Pay in 2nd Screen is clicked!");
		Thread.sleep(20000);
		log.info("Payment successful - Policy generated!");
	}

}