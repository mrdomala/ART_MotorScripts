package com.art.testcontext;

import org.openqa.selenium.WebDriver;

import com.art.pages.Common_Methods;
import com.art.pages.Dashboard_Verification;
import com.art.pages.Download_Ecard;
import com.art.pages.Download_Policy_Certificate;
import com.art.pages.Motor_Logged_CustomNo;
import com.art.pages.Update_Mob_Email;
import com.art.pages.Verify_MyProfile;

public class StepData {
	WebDriver driver;
	Dashboard_Verification dv;
	Download_Policy_Certificate dpc;
	Download_Ecard de;
	Verify_MyProfile pv;
	Update_Mob_Email um;
	Motor_Logged_CustomNo mcf;
	Common_Methods cm;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public Verify_MyProfile getPv() {
		return pv;
	}

	public Update_Mob_Email getUm() {
		return um;
	}

	public Dashboard_Verification getDv() {
		return dv;
	}

	public Motor_Logged_CustomNo getMCF() {
		return mcf;
	}

	public Download_Policy_Certificate getDpc() {
		return dpc;
	}
	
	public Download_Ecard getDe() {
		return de;
	}

	public Common_Methods getCm() {
		return cm;
	}

	public void initializePageObject(WebDriver driver) {
		dv = new Dashboard_Verification(driver);
		pv = new Verify_MyProfile(driver);
		um = new Update_Mob_Email(driver);
		dpc = new Download_Policy_Certificate(driver);
		de = new Download_Ecard(driver);
		mcf = new Motor_Logged_CustomNo(driver);

	}

	public void commonMethods() {
		cm = new Common_Methods();
	}

}
