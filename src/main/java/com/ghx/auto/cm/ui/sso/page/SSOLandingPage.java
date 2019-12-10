package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class SSOLandingPage extends CMAbstractPage<SSOLandingPage> {

	private By usernameDropdown = By.id("headerUsername");
	private By profile = By.id("userprofile");
	private By logout = By.id("headerLogout");
	private By adminconsole = By.id("adminConsole");
	private By vendormateCredentialingLink = By.linkText("Vendormate Credentialing");
	private By contractingAndComplianceSolutionsLink = By.linkText("Contracting and Compliance solutions");
	private By headerSwitcher = By.id("headerSwitcher");
	private By contactingAndCompliane = By.xpath(".//div[@id='4']/ul/li/a/span");
	private By headerUserName = By.id("headerUsername");
	private By logOutButton = By.id("headerLogout");
	private By accessDeniedClickHereLink = By.xpath("//*[contains(@href,'https://login-stg.awsdsi.ghx.com')]");
	private By credentialingAndComplianceText = By.xpath(".//*[@id='contentBody']/div[1]/div/div/div/div/ul/li[1]/h3/span");

	private By clickHere = By.linkText("click here");
	//private By accessDeniedMessage = By.xpath("html/body/div[1]/div[2]/div/div/div/div/p/span");

	public SSOLandingPage click_vendormate_credentialing_link() {
		wait_until(3);
		click_link(vendormateCredentialingLink);
		return this;
	}
	
	
	public SSOLandingPage verify_credentialing_and_compliance_text() {
		wait_until(3);
		verify_element_by_text(credentialingAndComplianceText,"Credentialing & Compliance");
		return this;
	}

	public SSOLandingPage click_contracting_and_compliance_solutions_link() {
		wait_until(3);
		click_link(contractingAndComplianceSolutionsLink);
		return this;
	}

	// click switcher button
	public SSOLandingPage click_headerSwitcher() {
		return click_button(headerSwitcher);
	}

	// click Contracting & compliance solution
	
	public SSOLandingPage click_contacting_and_compliane() {
		return click_button(contactingAndCompliane);
	}

	
	// access denied
	public SSOLandingPage click_here_link(){
		wait_until(3);
		return click_link(clickHere);
	}

	// Logout
	public SSOLandingPage click_header_name_for_logout() {
		wait_until(2);
		return click_button(headerUserName);
	}

	public SSOLandingPage click_logout_button() {
		wait_until(2);
		return click_button(logOutButton);
	}

	public SSOLandingPage verify_userName(String uesrname) {
		verify_element_by_text_continue(usernameDropdown, uesrname);
		wait_until(2);
		return this;
	}
	

}
