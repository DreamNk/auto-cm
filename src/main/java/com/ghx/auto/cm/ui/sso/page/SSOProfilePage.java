package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class SSOProfilePage extends CMAbstractPage<SSOProfilePage> {

	// Buyer Profile section-----------------------------------
	private By backToDashboard = By.linkText(" Back to Dashboard");
	private By firstName = By.xpath(".//div[@id='contentBody']/div[1]/div/div/div/div/div[2]/div/form/div/div/div[1]/div");
	private By lastName = By.xpath(".//div[@id='contentBody']/div[1]/div/div/div/div/div[2]/div/form/div/div/div[2]/div");
	private By workPhone = By.xpath(".//div[@id='contentBody']/div[1]/div/div/div/div/div[2]/div/form/div/div/div[3]/div");
	private By mobilePhone = By.xpath("/html/body/div[3]/div[1]/div/div/div/div/div[2]/div/form/div/div/div[5]/div");
	private By emailId = By.xpath(".//div[@id='contentBody']/div[1]/div/div/div/div/div[2]/div/form/div/div/div[7]/div");
	private By organizationName = By.xpath(".//div[@id='contentBody']/div[1]/div/div/div/div/div[2]/div/form/div/div/div[10]/div");
	private By role = By.xpath(".//div[@id='contentBody']/div[1]/div/div/div/div/div[2]/div/form/div/div/div[11]/div");
	private By userName = By.xpath(".//div[@id='contentBody']/div[1]/div/div/div/div/div[2]/div/form/div/div/div[12]/div");

	public SSOProfilePage click_back_to_dashboard_link() {
		click(backToDashboard);
		return this;
	}

	public SSOProfilePage verify_first_name_in_sso_profile(String fname) {
		verify_element_by_text(firstName, fname);
		wait_until(1);
		return this;
	}

	public SSOProfilePage verify_last_name_in_sso_profile(String lname) {
		verify_element_by_text(lastName, lname);
		wait_until(1);
		return this;
	}

	public SSOProfilePage verify_work_phone_in_profile(String workPhNumber) {
		verify_element_by_text(workPhone, workPhNumber);
		wait_until(1);
		return this;
	}

	public SSOProfilePage verify_mobile_phone_in_profile(String mobPhNumber) {
		verify_element_by_text(mobilePhone, mobPhNumber);
		wait_until(1);
		return this;
	}

	public SSOProfilePage verify_emailid_in_profile(String mailId) {
		verify_element_by_text(emailId, mailId);
		wait_until(1);
		return this;
	}

	public SSOProfilePage verify_organization_name_in_profile(String OrgName) {
		verify_element_by_text(organizationName, OrgName);
		wait_until(1);
		return this;
	}

	public SSOProfilePage verify_role_in_profile(String userRole) {
		verify_element_by_text(role, userRole);
		wait_until(1);
		return this;
	}

	public SSOProfilePage verify_username_in_profile(String userId) {
		verify_element_by_text(userName, userId);
		wait_until(1);
		return this;
	}
}
