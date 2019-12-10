package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RMDashVRPReportPage extends CMAbstractPage<RMDashVRPReportPage> {
	
private By customerSearchTextbox = By.xpath("//*[contains(@name,'filterForCustomerString')]");
private By googleStringTextbox = By.xpath("//*[contains(@name,'filterForGoogleString')]");
private By continueButton = By.xpath("//*[contains(@value,'Continue')]");
private By vendordashLinkFor1stSearchRecord = By.xpath("(//a[contains(text(),'VendorDash')])[1]");
private By backButton = By.xpath("//*[contains(@src,'images/v_but_back.gif')]");



	public RMDashVRPReportPage enter_customer_search(String customer_name) {
		enter(customerSearchTextbox, customer_name);
		wait_until(3);
		return this;
	}
	
	public RMDashVRPReportPage enter_google_search_string(String search_string) {
		enter(googleStringTextbox, search_string);
		wait_until(3);
		return this;
	}
	
	public RMDashVRPReportPage click_continue_button() {
		click(continueButton);
		wait_until(3);
		return this;
	}
	
	public RMDashVRPReportPage click_vendordash_link_for_1st_search_record() {
		click(vendordashLinkFor1stSearchRecord);
		wait_until(3);
		return this;
	}
	
	public RMDashVRPReportPage click_back_button() {
		click(backButton);
		wait_until(3);
		return this;
	}

}
