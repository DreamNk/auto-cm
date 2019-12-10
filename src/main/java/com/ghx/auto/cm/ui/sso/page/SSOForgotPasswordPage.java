package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class SSOForgotPasswordPage extends CMAbstractPage<SSOForgotPasswordPage> {
	
	private By enterEmailText = By.xpath(".//*[@id='emailDiv']/div[1]/div/h4");
	private By emailAddress = By.id("userEmailAddress");
	private By nextButton = By.id("emailNextBtn");
	
	private By checkYourEmailText = By.xpath(".//*[@id='mainContainer']/div/div[2]/div/div[1]/div/h4");
	private By backToLogin = By.id("backTologinBtn");
	
	private By errorMessageForLDAPUser = By.xpath(".//*[@id='forgotPasswordForm']/div[1]/div/div/div/div/div");
	private By cancelButton = By.id("emailCancelBtn");
	private By passwordManagement = By.linkText("GHX Password Management");	
	
	// locator for the https://reset.ghx.com/showLogin.cc page
	private By resetPassLink = By.id("hrefReset");
	
	public SSOForgotPasswordPage verify_enter_email_text(String text){
		return verify_element_by_text(enterEmailText, text);
	}
	
	public SSOForgotPasswordPage enter_email_address(String email){
		return enter(emailAddress, email);
	}
	
	public SSOForgotPasswordPage click_next_button(){
		return click_button(nextButton);
	}

	public SSOForgotPasswordPage verify_check_your_email_text(String text){
		return verify_element_by_text(checkYourEmailText, text);
	}
	
	public SSOForgotPasswordPage click_back_to_login_button(){
		return click_button(backToLogin);
	}
	
	public SSOForgotPasswordPage verify_ldap_user_error_text(String text){
		return verify_element_by_text(errorMessageForLDAPUser, text);
	}
	
	public SSOForgotPasswordPage click_cancel_button(){
		return click_button(cancelButton);
	}
	
	public SSOForgotPasswordPage click_password_management(){
		return click(passwordManagement);
	}
	
	//method for https://reset.ghx.com/showLogin.cc page
	public SSOForgotPasswordPage verify_reset_pass_link(String text){
		return verify_element_by_text(resetPassLink, text);
	}
}
